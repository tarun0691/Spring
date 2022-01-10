package com.annotation.autowiring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        //ApplicationContext is the spring ioc container that manages the objects for our java application
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //getting the Human class object managed by the ioc
        Human human = context.getBean("human", Human.class);
        human.isHeartBeating();
    }
}
