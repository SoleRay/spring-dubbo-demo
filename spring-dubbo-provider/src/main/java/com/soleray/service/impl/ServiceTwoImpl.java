package com.soleray.service.impl;

import com.soleray.service.ServiceTwo;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ServiceTwoImpl implements ServiceTwo {

    @Override
    public String twoHello(String name) {
        System.out.println("@@@@@@@ " + name);
        return "twoHello " + name;
    }
}
