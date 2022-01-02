package com.practice.spring.dio;

public class Student {

    private Integer id;
    Subject subject;

    public void setId(int id) {
        this.id = id;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void subjectToLearn(){
        if(id == 1){
            System.out.println("Student with id : " + id);
            subject.english();
        }
        else if(id == 2){
            System.out.println("Student with id : " + id);
            subject.mathematics();
        }

    }
}
