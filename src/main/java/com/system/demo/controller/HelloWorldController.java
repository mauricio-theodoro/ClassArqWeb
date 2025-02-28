package com.system.demo.controller;

import com.system.demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld(@RequestParam(required = false, defaultValue = "Visitante") String name) {
        return helloWorldService.helloWorld(name);
    }
}
