package com.epam.hujj.tamasknizner.springhomework.domain;

public class FootballField {

    private final String name;
    private WeatherType weatherType;

    public FootballField(String name, WeatherType weatherType) {
        this.name = name;
        this.weatherType = weatherType;
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FootballField [name=" + name + ", weatherType=" + weatherType + "]";
    }

}
