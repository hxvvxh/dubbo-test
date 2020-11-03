package com.hp.dubbo.test.consumer.autoconfigration;

import com.hp.dubbo.boot.api.HpAutoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/28 7:39
 */
@Configuration
public class HpAutoConfigration {
    @Bean
    public HpAutoService hpAutoServiceServiceConfig(){
        ReferenceConfig<HpAutoService> config=new ReferenceConfig<>();
        config.setApplication(new ApplicationConfig("dubbo_consumer"));
        config.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        config.setInterface(HpAutoService.class);
        HpAutoService hpAutoService=config.get();
        return hpAutoService;
    }
}
