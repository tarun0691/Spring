package com.practice.spring.dio;

public class Student {

    Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void subject(){
        subject.english();
    }
}
