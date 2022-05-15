package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/number")
public class NumberController {

    @GetMapping("/first")
    public String first() {
        return "number-pages/first";
    }
    @GetMapping("/second")
    public String second() {
        return "number-pages/second";
    }
    @GetMapping("/third")
    public String third() {
        return "number-pages/third";
    }

}
