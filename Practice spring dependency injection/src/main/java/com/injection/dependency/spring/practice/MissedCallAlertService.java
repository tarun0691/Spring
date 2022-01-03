package com.injection.dependency.spring.practice;

public class MissedCallAlertService implements Service{
    @Override
    public void service() {
        System.out.println("Missed call alert service activated!!");
    }
}
