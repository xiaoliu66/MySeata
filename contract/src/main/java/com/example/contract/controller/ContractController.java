package com.example.contract.controller;

import com.example.contract.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private IContractService iService;

    @GetMapping("/update")
    public void update() {
        iService.doSomethings();
    }
}
