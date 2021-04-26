package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class MapController {

    @GetMapping(value = "/map")
    public String desplegarParametros(@RequestParam Map<String, String> parametros) {
        // Después se puede trabajar con ellos usando sus claves
        return "Parámetros ingresados: " + parametros.entrySet();
    }

}
