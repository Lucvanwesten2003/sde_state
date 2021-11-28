package com.hz;

public interface GumballMachineState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
