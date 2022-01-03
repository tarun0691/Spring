package com.injection.dependency.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        //IOC container that reads the beans xml file and gets all the objects from the container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //this will get the bean named airtel from beans.xml and inject all the dependencies(literal and objective)
        Airtel airtel = context.getBean("airtel", Airtel.class);
        airtel.activateService();
    }
}
