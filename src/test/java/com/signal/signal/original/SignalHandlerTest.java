package com.signal.signal.original;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SignalHandlerTest {
    @Autowired
    private SignalHandlerImpl signalHandler;

    @Test
    public void given_validSignal_when_invoked_then_executes() {
        signalHandler.handleSignal(1);
    }

    @Test
    public void given_invalidSignal_when_invoked_then_exception() {
        Assertions.assertThrows(RuntimeException.class, () -> {signalHandler.handleSignal(100_000);});
    }
}
