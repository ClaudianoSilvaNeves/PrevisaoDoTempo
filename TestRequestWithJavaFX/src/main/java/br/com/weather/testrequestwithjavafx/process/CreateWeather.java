package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import org.w3c.dom.Element;

public class CreateWeather {
    public WeatherStatus create(Element element) {
        String day = element.getElementsByTagName("dia").item(0).getTextContent();
        int max = Integer.parseInt(element.getElementsByTagName("maxima").item(0).getTextContent());
        int min = Integer.parseInt(element.getElementsByTagName("minima").item(0).getTextContent());
        double iuv = Double.parseDouble(element.getElementsByTagName("iuv").item(0).getTextContent());
        String weather = element.getElementsByTagName("tempo").item(0).getTextContent();
        return new WeatherStatus(day, max, min, iuv, weather);
    }
}
