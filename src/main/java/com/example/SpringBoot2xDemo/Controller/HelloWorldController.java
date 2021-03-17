package com.example.SpringBoot2xDemo.Controller;

import com.example.SpringBoot2xDemo.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloWorldController {

    private LimitConfig limitConfig;

    @Autowired
    public void setLimitConfig(LimitConfig limitConfig) {
        this.limitConfig = limitConfig;
    }

    @GetMapping("hello")
    public String Hello() {
        return "Hello Spring Boot! 说明:"+ limitConfig.getDescription();
    }

}
