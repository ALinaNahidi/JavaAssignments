package com.assignment7;

import java.util.ArrayList;

public class Assignment7_2 {
    public static void main(String[] args) {
        ArrayList<Cycle> arrayList = new ArrayList<>();
        arrayList.add(new Bicycle());
        arrayList.add(new Unicycle());
        arrayList.add(new Tricycle());

        for (Cycle cycle : arrayList){
            cycle.balance();
        }

    }
}
