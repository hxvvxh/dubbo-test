package com.hp.dubbo.test.provider;

import com.hp.dubbo.test.api.HpService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/27 21:48
 */
@DubboService(version = "1.0.0",interfaceClass = HpService.class) //2.7.8
//@Service(version = "1.0.0",interfaceClass = HpService.class)//2.7.3
public class HpServiceImpl implements HpService {


    @Override
    public String helloWord(String say){
        System.out.println("success say:{}"+say);
        return "provider"+say;
    }
}
