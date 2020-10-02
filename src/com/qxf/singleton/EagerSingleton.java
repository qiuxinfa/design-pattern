package com.qxf.singleton;

// 单例：饿汉式
public class EagerSingleton {

    // 单例对象
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    // 构造器私有
    private EagerSingleton (){};

    // 获取实例的公共方法
    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }

}
