package com.annotation.autowiring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    public Human(){
    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    //Qualifier is used to resolve the byName conflict if there are multiple heart beans in the beans.xml
    @Autowired
    @Qualifier("animalHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter method called");
    }

    public void isHeartBeating() {
        if (heart != null) {
            heart.beat();
        } else {
            System.out.println("The "+ heart.getNameOfSpecies()+ "is dead!!");
        }
    }
}
