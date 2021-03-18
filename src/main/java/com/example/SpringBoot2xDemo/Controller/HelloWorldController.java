package com.example.SpringBoot2xDemo.Controller;

import com.example.SpringBoot2xDemo.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Controller + @ResponseBody = @RestController
 */

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private LimitConfig limitConfig;

    @Autowired
    public void setLimitConfig(LimitConfig limitConfig) {
        this.limitConfig = limitConfig;
    }

//    @GetMapping("/say")
    @PostMapping("/say")
//    @RequestMapping("/say")
    public String Hello(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "说明:" + limitConfig.getDescription();
        return "id:" + id;
    }

}
