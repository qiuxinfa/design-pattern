package com.qxf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object target;
    public DynamicProxyHandler(Object object){
        target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method invoke....");
        Object result = method.invoke(target, args);
        System.out.println("after method invoke....");
        return result;
    }

}
