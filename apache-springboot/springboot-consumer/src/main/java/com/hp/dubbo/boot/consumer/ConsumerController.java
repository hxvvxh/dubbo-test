package com.hp.dubbo.boot.consumer;

import com.hp.dubbo.boot.api.HpAutoService;
import com.hp.dubbo.boot.api.HpService;
import com.hp.dubbo.boot.spi.interfaces.HPSPI;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp
 * @version 1.0
 * @date 2020/8/27 21:44
 */
@RestController
public class ConsumerController {

//    @Reference(version = "1.0.0")//2.7.3
    @DubboReference(version = "1.0.0")//2.7.8
    private HpService hpService;

    @Autowired
    private HpAutoService hpAutoService;

    @GetMapping(value = "/say")
    @ResponseBody
    public String getSay(@RequestParam("sa") String say){
        return hpService.helloWord(say);
    }

    @GetMapping(value = "/auto")
    @ResponseBody
    public String getAuto(@RequestParam("sa") String say){
        return hpAutoService.test(say);
    }

    @GetMapping(value = "/defaultSPI")
    @ResponseBody
    public String getDefaultSPI(){
        HPSPI hpspi=ExtensionLoader.getExtensionLoader(HPSPI.class).getDefaultExtension();
        return hpspi.name();
    }

    @GetMapping(value = "/notDefaultSPI")
    @ResponseBody
    public String getNotDefaultSPI(){
        HPSPI hpspi=ExtensionLoader.getExtensionLoader(HPSPI.class).getExtension("notdefault");
        return hpspi.name();
    }
}
