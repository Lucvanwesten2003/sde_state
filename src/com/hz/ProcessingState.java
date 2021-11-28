package com.hz;

public class ProcessingState implements GumballMachineState {
    GumballMachine gumballMachine;
    int count;

    public ProcessingState(GumballMachine gumballMachine, int count){
        this.gumballMachine = gumballMachine;
        this.count = count;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("Quarter returned");
        this.gumballMachine.changeState(new ClosedState(this.gumballMachine, this.count), this.count);
    }

    @Override
    public void turnCrank(){
        System.out.println("You turned...");
        System.out.println("A gumball comes rolling out the slot");
        count = count - 1;
        this.gumballMachine.changeState(new ClosedState(this.gumballMachine, this.count), this.count);
    }

    @Override 
    public void dispense(){
        System.out.println("Turn the crank");
    }
}
