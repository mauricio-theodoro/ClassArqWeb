package com.system.demo.controller;

import com.system.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }



    //post, get, delete, put, patch, options, head
    //GET /helloWorld

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Maurício");
    }
}
