package org.example.configclientapp.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResources {


    @Value("${spring.datasource.url}")
    private String config;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok(config);
    }

}
