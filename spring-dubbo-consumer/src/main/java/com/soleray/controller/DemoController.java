package com.soleray.controller;

import com.soleray.service.DubboDemoService;
import com.soleray.service.ServiceOne;
import com.soleray.service.ServiceTwo;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo/demo")
public class DemoController {

    @Reference(methods = {@Method(name = "sayDubboHello",loadbalance = "random")})
    private DubboDemoService dubboDemoService;

    @Reference
    private ServiceTwo serviceTwo;

    @Reference
    private ServiceOne serviceOne;


    @PostMapping(value="/doSayHello")
    public void doSayHello(){
        String result = dubboDemoService.sayDubboHello("box");
        System.out.println(result);
    }
}
