package br.com.weather.testrequestwithjavafx.request;

public class GetCityInformation extends XMLRequest {
    @Override
    public String getXml(String string) {
        String newLink = "http://servicos.cptec.inpe.br/XML/cidade/" + string + "/previsao.xml";
        return super.getXml(newLink);
    }
}
