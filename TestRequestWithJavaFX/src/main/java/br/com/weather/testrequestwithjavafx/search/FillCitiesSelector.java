package br.com.weather.testrequestwithjavafx.search;

import br.com.weather.testrequestwithjavafx.models.City;
import javafx.scene.control.ComboBox;

import java.util.List;

public class FillCitiesSelector {
    public void fillSelector(ComboBox<City> selector, List<City> cities) {
        selector.getItems().clear();
        for (City c : cities) {
            selector.getItems().add(c);
            selector.setCellFactory(param -> new CityCellConvertName());
            selector.setButtonCell(new CityCellConvertName());
        }
    }
}
