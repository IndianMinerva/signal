package com.signal.signal.signal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SignalRegister {
    @Bean
    public Map<String, Signal> signalMap(ApplicationContext context) {
        return context.getBeansOfType(Signal.class); //All of this to avoid having to maintain a registry manually
    }
}
