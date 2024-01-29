package br.com.weather.testrequestwithjavafx;

import br.com.weather.testrequestwithjavafx.ui.style.LoadStyle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Weather extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Weather.class.getResource("weather.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Weather");
        stage.setScene(scene);
        stage.show();
        try {
            new LoadStyle().load(scene);
        } catch (NullPointerException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
