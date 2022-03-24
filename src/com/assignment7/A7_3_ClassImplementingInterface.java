package com.assignment7;

public class A7_3_ClassImplementingInterface extends Cycle implements A7_3_InheritingInterface {

    @Override
    public void method3() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    public void I1(A7_3_interface1 interface1) {
        System.out.println("Interface1");

    }
    public void I2(A7_3_interface2 interface2) {
        System.out.println("Interface2");
    }
    public void I3(A7_3_interface3 interface3) {
        System.out.println("Interface3");
    }
    public void I4(A7_3_InheritingInterface inheritingInterface) {
        System.out.println("Interface that inherits other interfaces");
    }

}
