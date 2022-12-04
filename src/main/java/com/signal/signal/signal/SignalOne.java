package com.signal.signal.signal;

import com.signal.signal.original.Algorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("1")
public class SignalOne implements Signal{
    @Autowired
    Algorithms algo;

    @Override
    public Integer getId() {
        return 1;
    }

    @Override
    public void perform() {
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
