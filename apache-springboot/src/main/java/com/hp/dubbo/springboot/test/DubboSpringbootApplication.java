package com.hp.dubbo.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author hp
 * @version 1.0
 * @date 2020/9/13 13:33
 */
@SpringBootApplication(scanBasePackages = {"com.hp.dubbo.springboot.test"},exclude = DataSourceAutoConfiguration.class)
public class DubboSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootApplication.class,args);
    }
}
