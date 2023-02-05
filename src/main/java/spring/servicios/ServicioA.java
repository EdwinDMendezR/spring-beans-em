package spring.servicios;

import static java.lang.String.format;

public class ServicioA {

    private ServicioB servicioB;

    public ServicioA(ServicioB servicioB) {
        this.servicioB = servicioB;
    }

    public String execute() {
        String result = servicioB.execute();
        return format("ServicioA::execute[%s]", result);
    }

}
