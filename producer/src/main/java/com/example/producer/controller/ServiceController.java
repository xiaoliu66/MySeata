package com.example.producer.controller;

import com.example.producer.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")

public class ServiceController {

    @Autowired
    private IService service;

    @GetMapping("/do")
    public void doSomething() {
        service.update();
    }
}
