package com.demo.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/hi")
    public String hi() {
        return "Hello";
    }
}