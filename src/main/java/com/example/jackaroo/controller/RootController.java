package com.example.jackaroo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RootController {
    @GetMapping("/")
    public String home() {
        return "API is running!";
    }
}
