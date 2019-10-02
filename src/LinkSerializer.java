import model.Link;

public class LinkSerializer {

    public static String toJson(final Link link) {
        // BEGIN
        final StringBuilder sb = new StringBuilder("{");

        sb.append("\"fullUrl\": ");
        if (link.getFullUrl() == null) {
            sb.append("null,");//Добавим к слову null сразу запятую
        } else {
            sb.append(String.format("\"%s\",", link.getFullUrl()));
        }
        //можно и проще:
        /*sb.append((link.getFullUrl() != null) ?
                String.format("\"%s\",", link.getFullUrl()) :
                "null,");//Добавим к слову null сразу запятую*/

        sb.append("\"code\": ");
        if (link.getCode() != null) {
            sb.append(String.format("\"%s\",", link.getCode()));
        } else { //наполнение и условие if-else перевернуто для наглядности
            sb.append("null,");
        }

        // Начало серриализации expiryDate
        sb.append("\"expiryDate\": ");
        if (link.getExpiryDate() != null) {
            sb.append('{');
            sb.append("\"month\": ");
            sb.append(link.getExpiryDate().getMonth());
            sb.append(',');
            sb.append("\"year\": ");
            sb.append(link.getExpiryDate().getYear());
            sb.append('}');
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
        // END
    }
}
