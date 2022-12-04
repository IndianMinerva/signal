package com.signal.signal.original;

import com.signal.signal.signal.Signal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class SignalHandlerImpl implements SignalHandler {
    @Autowired
    Map<Integer, Signal> signalRegister;

    @Override
    public void handleSignal(int id) {
        Signal signal = signalRegister.get(id);
        Optional.ofNullable(signal).ifPresentOrElse(Signal::perform, () -> {
            throw new RuntimeException("This Signal is not supported");
        });
    }
}
