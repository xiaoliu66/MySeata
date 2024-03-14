package com.example.measure.controller;

import com.example.measure.service.IMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measure")
public class MeasureController {

    @Autowired
    private IMeasureService iService;

    @GetMapping("/update")
    public void update() {
        iService.doSomethings();
    }
}
