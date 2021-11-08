package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {


    @GetMapping(value = "/")
    public String index(){
        return "Hello!!!!";
    }

}
