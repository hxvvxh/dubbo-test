package com.hp.dubbo.test.spi.interfaces;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author hp
 * @version 1.0
 * @date 2020/9/8 21:59
 */
@SPI("default")
public interface HPSPI {

    public String name();
}
