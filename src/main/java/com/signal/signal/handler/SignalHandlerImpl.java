package com.signal.signal.handler;

import com.signal.signal.signal.Signal;
import com.signal.signal.signal.SignalRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class SignalHandlerImpl implements SignalHandler {
    @Autowired
    SignalRegister signalRegister;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void handleSignal(int id) {
        Signal signal = signalRegister.signalMap(applicationContext).get(id + "");
        signal.perform();
    }
}
