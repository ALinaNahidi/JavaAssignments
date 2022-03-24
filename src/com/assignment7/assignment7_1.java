package com.assignment7;

import java.util.ArrayList;

public class assignment7_1 {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        ArrayList<Rodent> arrayList = new ArrayList<>();
        arrayList.add(new Gerbil());
        arrayList.add(new Hamster());
        arrayList.add(new Mouse());

        System.out.println();

        for(Rodent rodent1 : arrayList){
            rodent1.run();
            System.out.println();
        }


    }
}
