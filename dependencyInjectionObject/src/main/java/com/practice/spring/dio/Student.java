package com.practice.spring.dio;

public class Student {

    private int id;
    Subject subject;

    public void setId(int id) {
        this.id = id;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void subjectToLearn(){
        if(id == 1)
            subject.english();
        else
            subject.mathematics();
    }
}
