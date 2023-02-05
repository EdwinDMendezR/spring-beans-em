package spring.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import spring.servicios.ServicioA;
import spring.servicios.ServicioB;

@Configuration
public class BeansConfig {

    @Lazy
    @Bean
    public ServicioA getServicioA(ServicioB servicioB) {
        System.out.println("Creación del Bean Servicio A");
        return new ServicioA(servicioB);
    }

    @Bean
    public ServicioB getServicioB() {
        System.out.println("Creación del Bean Servicio B");
        return new ServicioB();
    }

}
