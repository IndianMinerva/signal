package com.signal.signal.handler;

/**
 * This is an upcall from our trading system, and we cannot change it.
 */
interface SignalHandler {
    void handleSignal(int signal);
}