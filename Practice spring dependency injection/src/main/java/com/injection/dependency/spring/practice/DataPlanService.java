package com.injection.dependency.spring.practice;

public class DataPlanService implements Service{
    @Override
    public void service() {
        System.out.println("Data plan service activated!!");
    }
}
