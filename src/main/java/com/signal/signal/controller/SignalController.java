package com.signal.signal.controller;

import com.signal.signal.service.SignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signals")
public class SignalController {
    @Autowired
    private SignalService signalService;

    @GetMapping("/invoke/{id}")
    public ResponseEntity<Void> invokeSignals(@PathVariable("id") int id) {
        try {
            signalService.handleSignal(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException re) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
