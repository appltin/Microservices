package com.hmall.cart.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced // 若有使用 Nacos 或 Ribbon 負載均衡需保留
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
