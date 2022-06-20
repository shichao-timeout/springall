package com.timeout.springcore.aop.aopall;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-cglibannoaop.xml");
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        SpringBeforeAdvice springBeforeAdvice = (SpringBeforeAdvice) applicationContext.getBean("springBeforeAdvice");
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(springBeforeAdvice);
        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.serve("lucy");
    }
}
