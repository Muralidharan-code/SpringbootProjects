package com.murali.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 10:26:45 PM
 * @version:2.0
 */
@SpringBootApplication
@RestController
public class SpringbootProfileApplication {
    @Value("${spring.application.name}")
    private String name;

    public static void main(String[] args) {
	SpringApplication.run(SpringbootProfileApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String name() {
	return name;
    }
}
