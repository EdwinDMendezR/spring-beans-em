package spring.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.servicios.ServicioA;
import spring.servicios.ServicioB;

@Configuration
public class BeansConfig {

    @Bean
    public ServicioA getServicioA(ServicioB servicioB) {
        return new ServicioA(servicioB);
    }

    @Bean
    public ServicioB getServicioB() {
        return new ServicioB();
    }

}
