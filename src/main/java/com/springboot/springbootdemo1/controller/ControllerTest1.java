package com.springboot.springbootdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest1 {
    @GetMapping(value = {"/", "/index.html"})
    public String index() {
        return "index";
    }
}
