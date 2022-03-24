package com.assignment5.main;

import com.assignment5.data.InsideDataClass;
import com.assignment5.singleton.InsideSingletonClass;

public class Main {
    public static void main(String[] args) {
        InsideDataClass insideDataClass = new InsideDataClass();
        insideDataClass.printChar1();
        insideDataClass.printNumber();

        InsideSingletonClass insideSingletonClass = new InsideSingletonClass();
        insideSingletonClass.printStr();
    }
}
