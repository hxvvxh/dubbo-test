package com.hp.dubbo.test.provider.autoconfigration;

import com.hp.dubbo.test.api.HpAutoService;
import com.hp.dubbo.test.provider.HpAutoServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
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
    public ServiceConfig<HpAutoService> hpAutoServiceServiceConfig(){
        ServiceConfig<HpAutoService> config=new ServiceConfig<>();
        config.setApplication(new ApplicationConfig("dubbo_provider"));
        config.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        config.setInterface(HpAutoService.class);
        config.setRef(new HpAutoServiceImpl());
        config.export();
        return config;
    }
}
