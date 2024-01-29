package br.com.weather.testrequestwithjavafx;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import br.com.weather.testrequestwithjavafx.ui.WeatherStatusPane;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.List;

public class WeatherViewController {

    @FXML
    private AnchorPane weatherStatus;
    public void showWeather(List<WeatherStatus> list) {
        new WeatherStatusPane().create(weatherStatus, list);
    }
}
