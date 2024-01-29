package br.com.weather.testrequestwithjavafx;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class WeatherView {
    public void loadSecondFrame(List<WeatherStatus> weatherStatuses) {
        try {
            FXMLLoader loader = new FXMLLoader(Weather.class.getResource("weather-view.fxml"));
            Parent root = loader.load();

            WeatherViewController controller = loader.getController();
            controller.showWeather(weatherStatuses);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
