package com.timeout.springcore.aop.springjdk;

public class FruitHandler {

    public void startEatFruitDate(){
        System.out.println("start to eat fruit:"+System.currentTimeMillis());
    }


    public void endEatFruitDate(){
        System.out.println("end to eat fruit:"+System.currentTimeMillis());
    }
}
