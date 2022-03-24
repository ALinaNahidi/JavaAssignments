package com.assignment5.singleton;

public class InsideSingletonClass {
    private String str;

    public static InsideSingletonClass method1(String str){
//        this.str = str;
//        this will not work because we cannot call non static methods/fields inside a static method
        return new InsideSingletonClass();
    }

    public void printStr(){
        System.out.println(str);
    }
}
