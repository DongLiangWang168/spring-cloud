package com.xinhui.wdl.order.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongliang.wang
 * @createTime 2019/6/28
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class OrderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
