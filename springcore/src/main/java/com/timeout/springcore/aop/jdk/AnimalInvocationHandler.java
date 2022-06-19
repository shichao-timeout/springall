package com.timeout.springcore.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalInvocationHandler implements InvocationHandler {
    //被代理的那个对象
    private Object target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("--before invoke--");


        //target:the object the underlying method is invoked from
        result = method.invoke(target, args);


        System.out.println("--after invoke--");
        return result;
    }

    /**
     * 绑定业务对象并返回一个代理类
     *
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


}
