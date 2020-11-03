package com.hp.dubbo.boot.spi.impl;

import com.hp.dubbo.boot.spi.interfaces.HPSPI;

/**
 * @author hp
 * @version 1.0
 * @date 2020/9/8 22:01
 */
public class notDefaultHpSPI implements HPSPI {
    @Override
    public String name() {
        return "notDefaultHpSPI";
    }
}
