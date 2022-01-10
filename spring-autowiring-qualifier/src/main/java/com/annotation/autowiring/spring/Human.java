package com.annotation.autowiring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public void isHeartBeating() {
        if (heart != null) {
            heart.beat();
        } else {
            System.out.println("The "+ heart.getNameOfSpecies()+ "is dead!!");
        }
    }
}
