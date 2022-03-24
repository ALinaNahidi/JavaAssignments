package com.assignment7;

public class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("Inside Gerbil Class");
    }
    @Override
    void run(){
        System.out.println("Gerbil is running");
    }
    @Override
    void sleep(){
        System.out.println("Gerbil is sleeping");
    }
}
