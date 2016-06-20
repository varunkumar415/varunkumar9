package edu.iit.hawk.vkumar17.madprojectteam13.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Model_Trailer {

    private String id;
    private String key;
    private String name;
    private String site;
    private String type;

    public Model_Trailer() {

    }

    public Model_Trailer(JSONObject trailer) throws JSONException {
        this.id = trailer.getString("id");
        this.key = trailer.getString("key");
        this.name = trailer.getString("name");
        this.site = trailer.getString("site");
        this.type = trailer.getString("type");
    }

    public String getId() {
        return id;
    }

    public String getKey() { return key; }

    public String getName() { return name; }

    public String getSite() { return site; }

    public String getType() { return type; }
}
