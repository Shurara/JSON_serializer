package magic;

//import com.google.gson.*;
import com.google.gson.Gson;
import model.Link;

public class LinkRializer {

    private static final Gson GSON = new Gson();

    public static Link deserialize(final String json) {

        return GSON.fromJson(json, Link.class);
    }
}