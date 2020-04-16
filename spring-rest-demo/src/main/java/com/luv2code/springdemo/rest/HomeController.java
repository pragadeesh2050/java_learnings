package com.luv2code.springdemo.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
