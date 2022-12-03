package com.signal.signal.signal;

import com.signal.signal.original.Algorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("2")
public class SignalTwo implements Signal{
    @Autowired
    Algorithms algo;

    @Override
    public String getId() {
        return "2";
    }

    @Override
    public void perform() {
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();
    }
}
