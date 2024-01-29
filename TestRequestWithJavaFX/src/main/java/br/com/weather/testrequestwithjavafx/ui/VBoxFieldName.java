package br.com.weather.testrequestwithjavafx.ui;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VBoxFieldName extends VBoxFill {
    @Override
    public VBox fill() {
        VBox vBox = new VBox(
                new Label("Weather: "),
                new Label("Max: "),
                new Label("Min: "),
                new Label("IUV: ")
                );
        new VBoxConfig().presset(vBox);
        return vBox;
    }
}
