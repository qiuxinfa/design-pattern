package com.qxf.singleton;

public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    // 构造器私有
    private EagerSingleton (){};

    // 获取实例的公共方法
    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }

}
