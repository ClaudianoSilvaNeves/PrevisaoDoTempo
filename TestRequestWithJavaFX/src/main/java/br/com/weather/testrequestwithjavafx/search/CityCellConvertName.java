package br.com.weather.testrequestwithjavafx.search;

import br.com.weather.testrequestwithjavafx.models.City;
import javafx.scene.control.ListCell;

public class CityCellConvertName extends ListCell<City> {

    @Override
    protected void updateItem(City city, boolean empty) {
        super.updateItem(city, empty);
        if (empty || city == null) {
            setText(null);
        } else {
            setText(city.getName() + " (" + city.getUf() + ")");
        }
    }
}
