package com.example.measure.feign;

import com.example.measure.config.FeignConfiguration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "measure-service",
        // name = "measure",
        // path = "/measure",
        // url = "http://localhost:7002/measure",
        configuration = FeignConfiguration.class
)
public interface MeasureFeign {

    @GetMapping("/measure/update")
    public void update();
}
