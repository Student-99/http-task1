import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsAboutCats {
    private String id;
    private String test;
    private String type;
    private String user;
    private Integer upvotes;

    public FactsAboutCats(@JsonProperty("id") String id,
                          @JsonProperty("text") String test,
                          @JsonProperty("type") String type,
                          @JsonProperty("user") String user,
                          @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.test = test;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactsAboutCats that = (FactsAboutCats) o;
        return id == that.id && Objects.equals(test, that.test) && Objects.equals(type, that.type) && Objects.equals(user, that.user) && Objects.equals(upvotes, that.upvotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, test, type, user, upvotes);
    }

    public String getId() {
        return id;
    }

    public String getTest() {
        return test;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "FactsAboutCats{" +
                "id=" + id +
                ", test='" + test + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }
}
