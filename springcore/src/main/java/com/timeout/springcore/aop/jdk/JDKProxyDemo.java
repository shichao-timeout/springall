package com.timeout.springcore.aop.jdk;

public class JDKProxyDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        AnimalInvocationHandler animalInvocationHandler = new AnimalInvocationHandler();
        Animal proxy = (Animal) animalInvocationHandler.bind(dog);
        proxy.eat();
    }
}
