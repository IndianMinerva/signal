package com.signal.signal.signal;

import org.springframework.stereotype.Component;

@Component("1")
public class FirstSignal implements Signal{

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public void perform() {
        System.out.println("Hello");
    }
}
