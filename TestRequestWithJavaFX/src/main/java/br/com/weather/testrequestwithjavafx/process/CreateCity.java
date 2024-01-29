package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.models.City;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateCity {
    public City create(Element element) {
        String nome = element.getElementsByTagName("nome").item(0).getTextContent();
        String id = element.getElementsByTagName("id").item(0).getTextContent();
        String uf = element.getElementsByTagName("uf").item(0).getTextContent();
        new VerifyFields().verify(new ArrayList<>(Arrays.asList(
                nome, id, uf
        )));
        return new City(nome, id, uf);
    }
}
