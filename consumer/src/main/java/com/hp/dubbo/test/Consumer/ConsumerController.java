package com.hp.dubbo.test.Consumer;

import com.hp.dubbo.test.api.HpService;
import org.apache.dubbo.config.annotation.Reference;
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

    @Reference(version = "1.0.0")
    private HpService hpService;

    @GetMapping(value = "/say")
    @ResponseBody
    public String getSay(@RequestParam("sa") String say){
        return hpService.helloWord(say);
    }
}
