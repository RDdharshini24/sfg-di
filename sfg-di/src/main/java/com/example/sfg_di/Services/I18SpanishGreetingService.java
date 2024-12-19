package com.example.sfg_di.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("spn")
@Service("i18Service")
public class I18SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "greeting spanish";
    }
}
