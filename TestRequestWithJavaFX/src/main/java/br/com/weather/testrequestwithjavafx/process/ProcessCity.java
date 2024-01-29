package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.models.City;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class ProcessCity {
    public ArrayList<City> process(String xmlResponse) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new ByteArrayInputStream(xmlResponse.getBytes()));
            NodeList cityNodeList = document.getElementsByTagName("cidade");

            ArrayList<City> cities = new ArrayList<>();

            for (int i = 0; i < cityNodeList.getLength(); i++) {
                Node city = cityNodeList.item(i);
                if (city.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementCity = (Element) city;
                    cities.add(new CreateCity().create(elementCity));
                }
            }
            return cities;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
