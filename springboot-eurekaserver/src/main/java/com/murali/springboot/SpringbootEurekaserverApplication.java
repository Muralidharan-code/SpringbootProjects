package com.murali.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 10:09:25 PM
 * @version:2.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaserverApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringbootEurekaserverApplication.class, args);
    }

}
