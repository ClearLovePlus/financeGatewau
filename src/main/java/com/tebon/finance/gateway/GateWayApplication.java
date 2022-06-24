package com.tebon.finance.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: springGateWay的启动类
 * @author: chenhao
 * @date: 2022-6-24 13:22
 */
@SpringBootApplication(scanBasePackages = {"com.tebon"})
@EnableDiscoveryClient
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }
}
