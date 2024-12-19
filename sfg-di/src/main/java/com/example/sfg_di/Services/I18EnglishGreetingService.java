package com.example.sfg_di.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("eng")
@Service("i18Service")
public class I18EnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "greeting english";
    }
}
