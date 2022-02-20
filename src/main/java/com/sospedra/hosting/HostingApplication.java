package com.sospedra.hosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.sospedra.hosting.controladores","com.sospedra.hosting.entidades","com.sospedra.hosting.respositorios","com.sospedra.hosting.servicios"})
public class HostingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostingApplication.class, args);
    }

}
