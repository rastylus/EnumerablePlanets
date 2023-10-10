package org.launchcode.models;

public enum Planets {
    MERCURY("Mercury", "88"),
    VENUS("Venus", "225"),
    EARTH("Earth", "365"),
    MARS("Mars", "687"),
    JUPITER("Jupiter", "4333"),
    SATURN("Saturn", "10759"),
    URANUS("Uranus", "30687"),
    NEPTUNE("Neptune", "60200");

    private final String name;
    private final String yearLength;

    Planets(String name, String yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public String getYearLength() {
        return yearLength;
    }
}
