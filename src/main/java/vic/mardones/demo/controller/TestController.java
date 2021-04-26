package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @GetMapping(value = "/test")
    public String desplegarTest(@RequestParam(defaultValue = "Test") String nombre) {
        return "Nombre: " + nombre;
    }

}
