package com.ibge.api.application.controller;


import  com.ibge.api.application.service.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Classe que vai receber requisições
@RestController
public class Controller {
    Service service = new Service();

    @GetMapping ("/noticiasereleases")
    public String noticiasEReleases(){
        return service.noticiasEReleases();
    }
    @GetMapping ("/noticias")
    public String noticias(){
        return service.noticias();
    }
    @GetMapping ("/releases")
    public  String releases (){
        return service.releases();
    }
}

