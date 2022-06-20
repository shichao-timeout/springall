package com.timeout.springcore.aop.springjdk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopXmlDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-xmlaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();
        System.out.println("sleep 1000 ms");
        banana.eat();
    }
}
