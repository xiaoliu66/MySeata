package com.example.measure;

import com.example.measure.config.FeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.*.*"
        // , defaultConfiguration = FeignConfiguration.class
)
@MapperScan("com.example.measure.dao")
public class MeasureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeasureApplication.class, args);
    }

}
