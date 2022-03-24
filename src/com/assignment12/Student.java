package com.assignment12;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int yearOfEnrollment;
    private double perTillDate;


    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }



    @Override
    public String toString(){
        return this.id+ " "+this.name + " "+ age+ " "+gender +" "+engDepartment +" "+yearOfEnrollment+ " "+ perTillDate;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
