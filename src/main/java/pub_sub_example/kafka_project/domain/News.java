package pub_sub_example.kafka_project.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class News {
   private final String title;
   private final Location location;
    @JsonCreator
    public News(@JsonProperty("title") String title, @JsonProperty("location") Location location) {
        this.title = title;
        this.location = location;
    }
    public String getTitle() {
        return title;
    }

    public Location getLocation() {
        return location == null ? Location.INTERNATIONAL : location;
    }

    @JsonIgnore
    public Integer getLocationIdentifier() {
        return Objects.isNull(location) ? Location.INTERNATIONAL.getIdentifier() : location.getIdentifier();
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", location=" + location +
                '}';
    }

}
