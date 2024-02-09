package com.dilshan.kubnernetesDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-kubernetes")
    public String getData(){
        return "In kubernetes project to minikube";
    }
}
