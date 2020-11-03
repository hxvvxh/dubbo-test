package com.hp.dubbo.boot.spi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author hp
 * @version 1.0
 * @date 2020/9/8 22:11
 */
@Component
public class SpiService {

    @Value("${server.port}")
    private String port;

    public String getPort(){
        return port;
    }
}
