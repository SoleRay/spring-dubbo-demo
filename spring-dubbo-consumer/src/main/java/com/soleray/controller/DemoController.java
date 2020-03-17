package com.soleray.controller;

import com.soleray.service.DubboDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo/demo")
public class DemoController {

    @Reference
    private DubboDemoService dubboDemoService;

    @PostMapping(value="/doSayHello")
    public void doSayHello(){
        String result = dubboDemoService.sayDubboHello("box");
        System.out.println(result);
    }
}
