package com.example.jackaroo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @GetMapping("/ping")
    public String ping() {
        return "Spring Boot is running!";
    }
}