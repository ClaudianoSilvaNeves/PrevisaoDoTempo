package br.com.weather.testrequestwithjavafx.ui;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VBoxFieldValue {
    public VBox fill(WeatherStatus weatherStatus) {
        VBox vBox = new VBox(
                new Label(weatherStatus.getWeather()),
                new Label(String.valueOf(weatherStatus.getMax())),
                new Label(String.valueOf(weatherStatus.getMin())),
                new Label(String.valueOf(weatherStatus.getIuv()))
        );
        new VBoxConfig().presset(vBox);
        return vBox;
    }
}
