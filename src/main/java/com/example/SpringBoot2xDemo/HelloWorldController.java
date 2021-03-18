package com.example.SpringBoot2xDemo;

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

    // 在Controller中调用yml配置文件中的变量
//    @Value("${limit.minMoney}")
//    private BigDecimal minMoney;

    // 给limitConfig对象使用@Autowired注解出现Field injection is not recommended警告
    // 解决方法：建立一个setter方法把注解套在该方法上
    private LimitConfig limitConfig;

    @Autowired
    public void setLimitConfig(LimitConfig limitConfig) {
        this.limitConfig = limitConfig;
    }

    @GetMapping("/say")
//    @PostMapping("/say")
//    @RequestMapping("/say")
    public String Hello(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "minMoney:" + minMoney;
//        return "说明:" + limitConfig.getDescription();
        return "id:" + id;
    }


}
