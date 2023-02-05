package spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.servicios.ServicioA;

@RestController
public class StatusRestController {

    @Lazy
    @Autowired
    private ServicioA servicioA;

    @GetMapping
    public boolean getStatus() {
        return true;
    }

    @GetMapping("/servicioa")
    public String getServicioA() {
        return servicioA.execute();
    }

}
