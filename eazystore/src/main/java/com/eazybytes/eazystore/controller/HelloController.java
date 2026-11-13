package com.eazybytes.eazystore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//This is a controller class annotation
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Purshotam,Atharv,Pranay Dada";

    }

}
