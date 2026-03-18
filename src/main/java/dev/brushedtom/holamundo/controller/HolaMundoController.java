package dev.brushedtom.holamundo.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

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
    Map<Integer, String> productos = new HashMap<>();
    int id = 1;

    @GetMapping ("/productos")
    public Map<Integer, String>ver(){
        return productos;
    }

    @PostMapping("/productos/{nombre}")
    public String agregar(@PathVariable String nombre){
        productos.put(id++, nombre);
        return "Agregado";
    }
    @PutMapping("/productos/{id}/{nombre}")
    public String camboiar(@PathVariable int id, @PathVariable String nombre){
        productos.put(id, nombre);
        return  "Cambiardo";
    }

    @DeleteMapping("/productos/{id}")
    public String borrar (@PathVariable int id){
        productos.remove(id);
        return "Borrado";
    }
}
