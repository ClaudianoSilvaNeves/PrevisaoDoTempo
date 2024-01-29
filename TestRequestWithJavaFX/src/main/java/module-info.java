module com.example.testrequestwithjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires java.net.http;
    requires java.xml;

    opens br.com.weather.testrequestwithjavafx;
    exports br.com.weather.testrequestwithjavafx;
    opens br.com.weather.testrequestwithjavafx.ui;
    exports br.com.weather.testrequestwithjavafx.ui;
    exports br.com.weather.testrequestwithjavafx.search;
    opens br.com.weather.testrequestwithjavafx.search;

    opens  br.com.weather.testrequestwithjavafx.models;
    exports  br.com.weather.testrequestwithjavafx.models;
}