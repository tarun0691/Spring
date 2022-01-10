package com.annotation.autowiring.spring;

public class Heart {

    private String nameOfSpecies;

    public String getNameOfSpecies() {
        return nameOfSpecies;
    }

    public void setNameOfSpecies(String nameOfSpecies) {
        this.nameOfSpecies = nameOfSpecies;
    }

    public void beat(){
        System.out.println(getNameOfSpecies() + " Heart is beating!!");
    }
}
