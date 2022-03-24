package com.assignment7;

public class Hamster extends Rodent{
    public Hamster() {
        System.out.println("Inside Hamster Class");
    }
    @Override
    void run(){
        System.out.println("Hamster is running");
    }
    @Override
    void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
