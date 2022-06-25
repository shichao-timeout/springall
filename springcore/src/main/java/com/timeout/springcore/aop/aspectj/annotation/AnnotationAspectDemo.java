package com.timeout.springcore.aop.aspectj.args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aspectjargs.xml");

        FoodFactory foodFactory = (FoodFactory) applicationContext.getBean("foodFactory");
        foodFactory.delivery("shanghai");
        System.out.println("-------------------------------");
        Factory phoneFactory = (Factory) applicationContext.getBean("phoneFactory");
        phoneFactory.delivery("北京");
        System.out.println("-------------------------------");
        FreshFoodFactory freshFoodFactory = (FreshFoodFactory) applicationContext.getBean("freshFoodFactory");
        freshFoodFactory.testArgsAnnotation(freshFoodFactory);
        System.out.println("-------------------------------");
        FrozenFoodFactory frozenFoodFactory = (FrozenFoodFactory) applicationContext.getBean("frozenFoodFactory");
        foodFactory.testArgsAnnotation(frozenFoodFactory);
    }

}
