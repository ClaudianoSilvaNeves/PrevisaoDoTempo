package br.com.weather.testrequestwithjavafx.search;

import br.com.weather.testrequestwithjavafx.models.City;
import br.com.weather.testrequestwithjavafx.process.ProcessCity;
import br.com.weather.testrequestwithjavafx.request.GetCityID;
import javafx.scene.control.TextField;

import java.util.List;

public class FindCity {
    public static List<City> search(TextField textField) {
        return new ProcessCity().process(new GetCityID().getXml(textField.getText()));
    }
}
