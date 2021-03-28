package com.aibin.example.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.aibin.example.springcloud.mapper"})
@EnableDiscoveryClient
public class ProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8001.class, args);
    }
}
