package com.injection.dependency.spring.practice;

public class CallerTuneService implements Service{
    @Override
    public void service() {
        System.out.println("Caller tune service activated!!");
    }
}
