package com.cenetic.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;

/**
 * Classe de inicialização para o serviço de licenciamento.
 *
 * Utiliza Spring Boot para configurar um microserviço.
 *
 * Created by mauriciofernandesdecastro on 03/03/16.
 */
@SpringBootApplication(scanBasePackages = {"com.cenetic.config"})
@EntityScan({"org.helianto.*.domain", "com.cenetic.*.domain"})
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

}
