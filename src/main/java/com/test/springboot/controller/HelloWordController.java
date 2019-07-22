package com.test.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloWordController {

    @RequestMapping("hello")
    public  String getIndex(){
        return "hello word";
    }
}
