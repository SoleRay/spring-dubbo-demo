package com.soleray.service.impl;

import com.soleray.service.DubboDemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public String sayDubboHello(String name) {
        System.out.println("*********************** " + name);
        return "Hello " + name;
    }

    @Override
    public void sayDubboGoodNight(String name) {

    }
}
