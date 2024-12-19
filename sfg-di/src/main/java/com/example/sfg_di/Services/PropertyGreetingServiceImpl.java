package com.example.sfg_di.Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component("propertyGreetingServiceImp")
@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Greeting from property";
    }
}
