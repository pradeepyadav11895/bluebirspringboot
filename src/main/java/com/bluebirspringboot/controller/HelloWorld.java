package com.bluebirspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("/")
    public String sayhello() {
        return "index";
    }
}
