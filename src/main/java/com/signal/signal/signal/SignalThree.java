package com.signal.signal.signal;

import com.signal.signal.original.Algorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("3")
public class SignalThree implements Signal {
    @Autowired
    Algorithms algo;

    @Override
    public Integer getId() {
        return 3;
    }

    @Override
    public void perform() {
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
