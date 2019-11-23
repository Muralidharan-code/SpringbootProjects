package com.murali.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 13, 2019 11:55:44 PM
 * @version:2.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
	return "Hello World!!";
    }
}
