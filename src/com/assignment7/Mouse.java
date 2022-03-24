package com.assignment7;

public class Mouse extends Rodent{
    public Mouse() {
        System.out.println("Inside Mouse Class");
    }

    @Override
    void run(){
        System.out.println("Mouse is running");
    }
    @Override
    void sleep(){
        System.out.println("Mouse is sleeping");
    }
}
