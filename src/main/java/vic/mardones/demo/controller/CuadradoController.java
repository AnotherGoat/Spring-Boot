package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class CuadradoController {

    @GetMapping(value = "/cuadrado")
    //@ResponseBody
    public String desplegarId(@RequestParam int x) {
        return "Cuadrado: " + Math.pow(x, 2);
    }
}
