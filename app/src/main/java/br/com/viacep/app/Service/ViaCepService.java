package br.com.viacep.app.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.viacep.app.Model.Endereco;

@Service
public class ViaCepService {

    public Endereco buscarEndereco(String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,Endereco.class);
    }

}
