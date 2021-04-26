package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class NombreController {

    @GetMapping(value = "/nombre")
    public String desplegarNombre(@RequestParam(required = false) String nombre) {
        return "Nombre: " + nombre;
    }

}
