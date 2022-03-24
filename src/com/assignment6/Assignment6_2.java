package com.assignment6;

public class Assignment6_2 {
    public static void main(String[] args) {
        classStudent classStudent1 = new classStudent("a",21);
        classStudent classStudent2= new classStudent("b");
        System.out.println(classStudent1.getAge()+ " "+classStudent1.getName());
        System.out.println(classStudent2.getAge()+" "+classStudent2.getName());

    }
}