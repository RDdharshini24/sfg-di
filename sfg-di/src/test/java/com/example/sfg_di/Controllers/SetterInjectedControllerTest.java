package com.example.sfg_di.Controllers;

import com.example.sfg_di.Services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
        SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}