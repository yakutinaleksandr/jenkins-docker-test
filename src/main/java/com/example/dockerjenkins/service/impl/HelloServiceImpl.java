package com.example.dockerjenkins.service.impl;

import com.example.dockerjenkins.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private static final String HELLO = "hello";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
