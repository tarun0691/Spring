package com.practice.spring.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        //IOC container that reads the beans xml file and gets all the objects from the container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //this will get the bean named student from beans.xml and inject all the dependencies(literal and objective)
        Student student = context.getBean("student", Student.class);
        student.cheating();
    }
}
