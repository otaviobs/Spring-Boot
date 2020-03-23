package br.com.springboot.helloworld.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Informamos ao Spring que essa classe é um controller
@Controller
@RequestMapping("api/example")
public class HelloWorld {
 
    // Configuramos esse método para ser executado quando
    // o usuário acessar localhost:8080.
    // Esse endereço é padrão.
    @GetMapping("/hello-world")
    public  ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello world!");
    }
}