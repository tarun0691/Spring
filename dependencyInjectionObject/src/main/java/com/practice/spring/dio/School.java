package com.practice.spring.dio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

    public static void main(String[] args) {

        //IOC container that reads the beans xml file and gets all the objects from the container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //this will get the bean named englishStudent from beans.xml and inject all the dependencies(literal and objective)
        Student englishStudent = context.getBean("englishStudent", Student.class);
        englishStudent.subjectToLearn();

        //this will get the bean named mathematicsStudent from beans.xml and inject all the dependencies(literal and objective)
        Student mathematicsStudent = context.getBean("mathematicsStudent", Student.class);
        mathematicsStudent.subjectToLearn();
    }
}
