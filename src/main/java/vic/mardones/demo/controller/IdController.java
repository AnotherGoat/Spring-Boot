package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class IdController {

    @GetMapping(value = "/id")
    public String desplegarId(@RequestParam int id, @RequestParam String nombre) {
        // Nota importante: HTML no reconoce \n, pero <br> si
        return "Nombre: " + nombre + "<br>ID: " + id;
    }
}
