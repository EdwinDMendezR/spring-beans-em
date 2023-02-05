package spring.servicios;


import org.springframework.context.annotation.Lazy;

import static java.lang.String.format;

public class ServicioA {

    private ServicioB servicioB;

    @Lazy
    public ServicioA(ServicioB servicioB) {
        this.servicioB = servicioB;
    }

    public String execute() {
        String result = servicioB.execute();
        return format("ServicioA::execute[%s]", result);
    }

}
