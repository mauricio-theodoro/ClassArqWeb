package com.system.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World, " + name + "\n ! Bem-vindo ao sistema desenvolvido por Maurício.";
    }
}