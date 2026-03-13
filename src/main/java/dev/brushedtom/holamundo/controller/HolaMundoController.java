package dev.brushedtom.holamundo.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class HolaMundoController {

    @GetMapping ("/hola")
    public String holaMundo() {
        return "¡HOLA MUNDO!";
    }
    @PostMapping("/")
    public String postHola(){
        return "Registro Creado";
    }
}
