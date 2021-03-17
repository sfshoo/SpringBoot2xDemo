package com.example.SpringBoot2xDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String Hello() {
        return "Hello Spring Boot!";
    }
}
