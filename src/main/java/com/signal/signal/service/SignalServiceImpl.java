package com.signal.signal.service;

import com.signal.signal.original.SignalHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignalServiceImpl implements SignalService {
    @Autowired
    SignalHandlerImpl signalHandler;

    @Override
    public void handleSignal(int id) {
        signalHandler.handleSignal(id);
    }
}
