package com.hz;

public class ClosedState implements GumballMachineState {
    GumballMachine gumballMachine;
    int count;

    public ClosedState(GumballMachine gumballMachine, int count){
        this.gumballMachine = gumballMachine;
        this.count = count;
    }
    @Override
    public void insertQuarter(){
        if(this.count == 0){
            System.out.println("Sold out");
            this.gumballMachine.changeState(new SoldOutState(this.gumballMachine, this.count), this.count);
        }else{
        System.out.println("You inserted a quarter");
        this.gumballMachine.changeState(new ProcessingState(this.gumballMachine, this.count), this.count);
        }
    }

    @Override
    public void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank(){
        System.out.println("You turned but there's no quarter");
    }

    @Override 
    public void dispense(){
        System.out.println("You need to pay first");
    }

}

