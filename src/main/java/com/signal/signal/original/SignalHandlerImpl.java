package com.signal.signal.original;

import com.signal.signal.original.SignalHandler;
import com.signal.signal.signal.Signal;
import com.signal.signal.signal.SignalRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SignalHandlerImpl implements SignalHandler {
    @Autowired
    SignalRegister signalRegister;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void handleSignal(int id) {
        Signal signal = signalRegister.signalMap(applicationContext).get(id + "");
        Optional.ofNullable(signal).ifPresentOrElse(Signal::perform, () -> {
            throw new RuntimeException("This Signal is not supported");
        });
    }
}
