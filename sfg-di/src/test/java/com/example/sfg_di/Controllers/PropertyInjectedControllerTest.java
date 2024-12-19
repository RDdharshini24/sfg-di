package com.example.sfg_di.Controllers;

import com.example.sfg_di.Services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingServiceImpl();

    }

    @Test
    void getGreet() {
        System.out.println(controller.getGreeting());
    }
}