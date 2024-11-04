package org.example.configclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ConfigClientAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientAppApplication.class, args);
    }
}
