package com.practice.spring.di;

public class Student {

    private int id;
    private String studentName;

    public Student(int id) {
        this.id = id;
    }

    //spring will use this constructor to inject the dependencies
    //we need constructor to initialize the non static properties at the time of object creation
    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }


    public void displayStudentInfo()
    {
        System.out.println("Student name is " + studentName  + " and the student id is " + id);
    }
}
