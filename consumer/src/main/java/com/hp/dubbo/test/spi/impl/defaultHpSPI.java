package com.hp.dubbo.test.spi.impl;

import com.hp.dubbo.test.spi.SpiService;
import com.hp.dubbo.test.spi.interfaces.HPSPI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hp
 * @version 1.0
 * @date 2020/9/8 22:01
 */
public class defaultHpSPI implements HPSPI {
    @Autowired
    private SpiService spiService;
    @Override
    public String name() {
        return "defaultHpSPI"+"Spring autowired filed with spiService method port:"+spiService.getPort();
    }

    /**
     * dubbo 与spring 赋值属性的机制在于
     * 从Spring IOC 容器中(applicationContext) 获取名称为SpiService的bean
     *  调用类的set方法为属性进行赋值，也就是说 如果没有下面的方法，SpiService是空的
     * @param spiService
     */
    public void setSpiService(SpiService spiService) {
        this.spiService = spiService;
    }
}
