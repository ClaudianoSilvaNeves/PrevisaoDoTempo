package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.models.WeatherStatus;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class ProcessWeather {
    public ArrayList<WeatherStatus> process(String xmlResponse) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new ByteArrayInputStream(xmlResponse.getBytes()));
            NodeList weatherNodeList = document.getElementsByTagName("previsao");

            ArrayList<WeatherStatus> weathers = new ArrayList<>();

            for (int i = 0; i < weatherNodeList.getLength(); i++) {
                Node weather = weatherNodeList.item(i);
                if (weather.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementWeather = (Element) weather;
                    weathers.add(new CreateWeather().create(elementWeather));
                }
            } return weathers;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
