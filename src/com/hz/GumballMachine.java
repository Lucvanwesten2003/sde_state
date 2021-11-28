package com.hz;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    GumballMachineState state;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0){
            this.state = new SoldOutState(this, this.count);
        }
        this.state = new ClosedState(this, this.count);
    }

    public void changeState(GumballMachineState state, int count){
        this.state = state;
        this.count = count;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
        // if (state == HAS_QUARTER) {
        //     System.out.println("You can't insert another quarter");
        // } else if (state == NO_QUARTER) {
        //     state = HAS_QUARTER;
        //     System.out.println("You inserted a quarter");
        // } else if (state == SOLD_OUT) {
        //     System.out.println("You can't insert a quarter, the machine is sold out");
        // } else if (state == SOLD) {
        //     System.out.println("Please wait, we're already giving you a gumball");
        // }
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
        // if (state == HAS_QUARTER) {
        //     System.out.println("Quarter returned");
        //     state = NO_QUARTER;
        // } else if (state == NO_QUARTER) {
        //     System.out.println("You haven't inserted a quarter");
        // } else if (state == SOLD) {
        //     System.out.println("Sorry, you already turned the crank");
        // } else if (state == SOLD_OUT) {
        //     System.out.println("You can't eject, you haven't inserted a quarter yet");
        // }
    }

    public void turnCrank() {
        this.state.turnCrank();
        // if (state == SOLD) {
        //     System.out.println("Turning twice doesn't get you another gumball!");
        // } else if (state == NO_QUARTER) {
        //     System.out.println("You turned but there's no quarter");
        // } else if (state == SOLD_OUT) {
        //     System.out.println("You turned, but there are no gumballs");
        // } else if (state == HAS_QUARTER) {
        //     System.out.println("You turned...");
        //     state = SOLD;
        //     dispense();
        // }
    }


    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = new ClosedState(this, this.count);
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        // result.append("\nMachine is ");
        // if (state == SOLD_OUT) {
        //     result.append("sold out");
        // } else if (state == NO_QUARTER) {
        //     result.append("waiting for quarter");
        // } else if (state == HAS_QUARTER) {
        //     result.append("waiting for turn of crank");
        // } else if (state == SOLD) {
        //     result.append("delivering a gumball");
        // }
        result.append("\n");
        return result.toString();
    }
}
