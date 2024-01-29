package br.com.weather.testrequestwithjavafx.process;

import br.com.weather.testrequestwithjavafx.inteface.CheckFields;

import java.util.List;

public class VerifyFields implements CheckFields {
    @Override
    public void verify(List<String> list) {
        list.forEach(l -> {
            if (l.isEmpty()) {
                throw new RuntimeException();
            }
        });
    }
}
