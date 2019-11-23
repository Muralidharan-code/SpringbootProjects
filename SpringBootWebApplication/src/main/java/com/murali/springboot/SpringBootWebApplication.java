package com.murali.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 7:33:02 PM
 * @version:2.0
 */
@SpringBootApplication
@ComponentScan("com.murali.springboot.web")
public class SpringBootWebApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringBootWebApplication.class, args);
    }

}
