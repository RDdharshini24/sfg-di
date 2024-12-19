package com.example.sfg_di.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting from setter";
    }
}
