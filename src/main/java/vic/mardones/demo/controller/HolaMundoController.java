package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api")
public class HolaMundoController {

    @GetMapping(value = "/holamundo")
    public String desplegarHolaMundo() {
        return "Hola mundo";
    }
}
