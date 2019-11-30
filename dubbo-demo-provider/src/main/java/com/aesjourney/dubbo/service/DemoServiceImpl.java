package com.aesjourney.dubbo.service;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoService;

import java.io.Serializable;

@Service
public class DemoServiceImpl implements DemoService, Serializable {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
