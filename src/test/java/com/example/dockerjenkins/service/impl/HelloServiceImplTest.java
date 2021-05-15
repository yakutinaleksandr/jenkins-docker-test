package com.example.dockerjenkins.service.impl;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloServiceImplTest {

    private HelloServiceImpl service;

    @BeforeMethod
    public void setUp() {
        service = new HelloServiceImpl();
    }

    @Test
    public void testSayHello() {
        // Given
        final String expected = "hello1";

        // When
        final String actual = service.sayHello();

        // Then
        assertEquals(expected, actual);
    }
}