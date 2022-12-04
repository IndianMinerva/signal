package com.signal.signal.config;

import com.signal.signal.signal.Signal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class SignalConfig {

    @Autowired
    private List<Signal> signals;

    @Bean("signalRegister")
    public Map<Integer, Signal> signalMap() {
        return signals.stream().collect(Collectors.toMap(Signal::getId, Function.identity()));
    }
}
