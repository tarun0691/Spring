package com.injection.dependency.spring.practice;

public class Airtel {

    private Service service;

    //setter injection
    public void setService(Service service) {
        this.service = service;
    }

    public void activateService() {
        service.service();
    }
}
