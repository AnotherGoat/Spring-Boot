package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class HolaMundoController {

    @GetMapping(value = "/holamundo")
    public String desplegarHolaMundo() {
        return "Hola mundo";
    }
}
