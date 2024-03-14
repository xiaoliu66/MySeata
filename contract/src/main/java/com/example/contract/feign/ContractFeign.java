package com.example.contract.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "contract-service")
public interface ContractFeign {

    @GetMapping("/contract/update")
    public void update();
}
