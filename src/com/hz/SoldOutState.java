package com.hz;

public class SoldOutState implements GumballMachineState {
    GumballMachine gumballMachine;
    int count;

    public SoldOutState(GumballMachine gumballMachine, int count){
        this.gumballMachine = gumballMachine;
        this.count = count;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank(){
        System.out.println("You turned, but there are no gumballs");
    }

    @Override 
    public void dispense(){
        System.out.println("Oops, out of gumballs!");
    }
}
