import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetaryNasa {
    private String url;

    public PlanetaryNasa(@JsonProperty("url") String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
