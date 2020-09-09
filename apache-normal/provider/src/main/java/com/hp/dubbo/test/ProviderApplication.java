package com.hp.dubbo.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/27 21:43
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.hp.dubbo.test"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
