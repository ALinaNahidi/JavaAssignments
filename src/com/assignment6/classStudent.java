package com.assignment6;

public class classStudent {
    private String name;

    private int age;

    public classStudent(String name) {
        this(name,0);
    }

    public classStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
