package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.models.City;
import org.w3c.dom.Element;

import java.util.ArrayList;

public class CityList {
    private ArrayList<City> cities;

    public CityList() {
        cities = new ArrayList<>();
    }
    public void addToList(Element element) {
        this.cities.add(new CreateCity().create(element));
    }

    public ArrayList<City> getCities() {
        return this.cities;
    }
}
