package com.practice.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //this will get the bean named student from beans.xml and inject all the dependencies
        Student student = context.getBean("student", Student.class);
        student.displayStudentInfo();

        Student tarun = context.getBean("tarun", Student.class);
        tarun.displayStudentInfo();

    }
}
