package com.qxf.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        BuyCar buyCar = new BuyCarImpl();
        BuyCar proxyInstance = (BuyCar)Proxy.newProxyInstance(buyCar.getClass().getClassLoader(), buyCar.getClass().getInterfaces(), new DynamicProxyHandler(buyCar));
        proxyInstance.buyCar();
    }
}
