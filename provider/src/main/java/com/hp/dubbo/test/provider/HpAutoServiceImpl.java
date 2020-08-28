package com.hp.dubbo.test.provider;

import com.hp.dubbo.test.api.HpAutoService;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/28 7:38
 */
public class HpAutoServiceImpl implements HpAutoService {
    @Override
    public String test(String sa) {
        return sa+sa+sa;
    }
}
