package br.com.weather.testrequestwithjavafx.models;

import br.com.weather.testrequestwithjavafx.Weather;

public class City {
    private String name;
    private String id;
    private String uf;
    private WeatherStatus weatherStatus;

    public City(String name, String id, String uf) {
        this.name = name;
        this.id = id;
        this.uf = uf;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getUf() {
        return this.uf;
    }
}
