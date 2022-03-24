package com.assignment7;

public class Assignment7_4 {
    public static void main(String[] args) {
        getObj(new UniFactory());
        getObj(new BiFactory());
        getObj(new TriFactory());

    }

    public static void getObj(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.balance();
    }
}
