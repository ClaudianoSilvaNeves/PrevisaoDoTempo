package br.com.weather.testrequestwithjavafx.ui;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.util.List;

public class WeatherStatusPane {
    public void create(AnchorPane mainPane, List<WeatherStatus> weatherStatuses) {
        HBox hBox = new HBox();
        weatherStatuses.forEach(w -> {
            TitledPane titledPane = new TitledPane(w.getDay(), new AnchorPane(
                    new HBox(new VBoxFieldName().fill(), new VBoxFieldValue().fill(w))));
            hBox.getChildren().add(titledPane);
        });
        mainPane.getChildren().add(hBox);
    }
}
