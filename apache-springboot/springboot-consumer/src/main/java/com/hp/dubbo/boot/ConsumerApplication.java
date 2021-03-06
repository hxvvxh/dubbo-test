package com.hp.dubbo.boot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/27 21:51
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.hp.dubbo.boot"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
