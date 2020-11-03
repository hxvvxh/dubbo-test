package com.hp.dubbo.boot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author hp
 * @version 1.0
 * @date 2020/8/27 21:43
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.hp.dubbo.boot"})
public class BootProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootProviderApplication.class,args);
    }
}
