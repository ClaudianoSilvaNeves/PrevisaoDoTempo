package br.com.weather.testrequestwithjavafx;

import br.com.weather.testrequestwithjavafx.models.City;
import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import br.com.weather.testrequestwithjavafx.process.ProcessWeather;
import br.com.weather.testrequestwithjavafx.request.GetCityInformation;
import br.com.weather.testrequestwithjavafx.search.FillCitiesSelector;
import br.com.weather.testrequestwithjavafx.search.FindCity;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Controller {

    @FXML
    private TextField textFieldSearchCity;
    @FXML
    private Pane citiesPane;
    @FXML
    private ComboBox<City> comboBoxSelectCity;

    public void btnSearchCity() {
        citiesPane.setVisible(true);
        new FillCitiesSelector().fillSelector(comboBoxSelectCity, FindCity.search(textFieldSearchCity));
    }

    public void btnGetWeatherInformation() {
        ArrayList<WeatherStatus> list = new ProcessWeather().process(new GetCityInformation().getXml(comboBoxSelectCity.getValue().getId()));
        new WeatherView().loadSecondFrame(list);
    }
}
