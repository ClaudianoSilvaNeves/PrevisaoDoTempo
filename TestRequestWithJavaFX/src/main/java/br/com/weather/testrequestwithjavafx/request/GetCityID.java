package br.com.weather.testrequestwithjavafx.request;

public class GetCityID extends XMLRequest {
    @Override
    public String getXml(String city) {
        String newCity = city;
        if (city.contains(" ")) {
            newCity = city.replace(" ", "%20");
        }
        String newLink = "http://servicos.cptec.inpe.br/XML/listaCidades?city=" + newCity;
        return super.getXml(newLink);
    }
}
