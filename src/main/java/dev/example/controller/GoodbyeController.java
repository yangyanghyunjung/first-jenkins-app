package dev.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goodbye")
public class GoodbyeController {

    @GetMapping
    public String hello() {
        return "Goodbye Jenkins!!";
    }
}
