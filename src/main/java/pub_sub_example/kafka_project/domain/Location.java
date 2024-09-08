package pub_sub_example.kafka_project.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Location {
    BRAZIL("brazil", 2),
    US("us", 1),
    INTERNATIONAL("international", 0);

    private String name;
    private Integer identifier;

    Location(String name, Integer identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }
    @JsonCreator
    public Integer getIdentifier() {
        return identifier;
    }
    @JsonCreator
    public static Location fromName(String name) {
        if (name == null || name.isBlank()) return Location.INTERNATIONAL;
        for (Location location : Location.values()) {
            if (location.getName().equalsIgnoreCase(name)) {
                return location;
            }
        }
        throw new IllegalArgumentException(name + " is not valid");
    }
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", identifier=" + identifier +
                '}';
    }
}
