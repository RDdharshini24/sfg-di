package com.example.sfg_di.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Greetings from constructor";
    }

}
