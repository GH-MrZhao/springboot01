package com.example.springboot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrZhao
 * @version 1.0
 * @description com.example.springboot01.controller
 * @date 2018/10/28 23:17
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("say")
    public String sayHello(){
        return "hello wolrd";
    }
}
