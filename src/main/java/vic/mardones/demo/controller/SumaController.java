package vic.mardones.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SumaController {

    @GetMapping(value = "/suma")
    public String desplegarSuma(@RequestParam List<Integer> numeros) {
        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        return "Números ingresados: " + numeros.toString() + "<br>Suma: " + suma;
    }

}
