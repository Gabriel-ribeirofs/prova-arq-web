package com.ibge.api.application.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    public String consultarURL(String apiUrl) {

        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter as noticias e releases do dia. Código de Status:" + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String noticiasEReleases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias") ;
    }
    public String noticias(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }
    public String releases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

}
