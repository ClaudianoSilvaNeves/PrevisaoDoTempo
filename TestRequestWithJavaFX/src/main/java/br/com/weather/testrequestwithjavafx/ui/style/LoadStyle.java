package br.com.weather.testrequestwithjavafx.ui.style;

import javafx.scene.Scene;

public class LoadStyle {
    public void load(Scene scene) throws NullPointerException {
        String css = scene.getStylesheets().getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
    }
}
