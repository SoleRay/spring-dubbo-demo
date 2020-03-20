package com.soleray.service.impl;

import com.soleray.service.ServiceOne;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ServiceOneImpl implements ServiceOne {

    @Override
    public String oneHello(String name) {
        System.out.println("!!!!!!!!!!! " + name);
        return "oneHello " + name;
    }
}
