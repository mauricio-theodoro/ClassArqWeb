package com.system.demo.controller;

import com.system.demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    // Método GET
    @GetMapping
    public String helloWorld(@RequestParam(required = false, defaultValue = "Visitante") String name) {
        return helloWorldService.helloWorld(name);
    }

    // Método POST (opcional)
    @PostMapping
    public String helloWorldPost(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        return helloWorldService.helloWorld(name);
    }
}