package com.example.sfg_di.Controllers;

import com.example.sfg_di.Services.GreetingService;
import com.example.sfg_di.Services.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private GreetingService greetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.greetingService = primaryGreetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public String sayHello(){
        return "Hello world";
    }

}
