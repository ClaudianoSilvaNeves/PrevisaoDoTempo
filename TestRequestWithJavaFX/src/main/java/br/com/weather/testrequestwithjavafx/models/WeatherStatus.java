package br.com.weather.testrequestwithjavafx.models;

public class WeatherStatus {
    private String day;
    private int max;
    private int min;
    private double iuv;
    private String weather;

    public WeatherStatus(String day, int max, int min, double iuv, String weather) {
        this.day = day;
        this.max = max;
        this.min = min;
        this.iuv = iuv;
        this.weather = weather;
    }

    public String getDay() {
        return this.day;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public double getIuv() {
        return this.iuv;
    }

    public String getWeather() {
        return this.weather;
    }
}
