package com.soleray.service.impl;

import com.soleray.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	// 示例方法的实现
	public String sayHello(String name) {
		System.out.println("*********************** " + name);
		return "Hello " + name;
	}
}