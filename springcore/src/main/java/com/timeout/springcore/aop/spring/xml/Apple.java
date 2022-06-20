package com.timeout.springcore.aop.springjdk;

public class Apple implements Fruit {
    public void eat() {
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("eat apple");
    }
}
