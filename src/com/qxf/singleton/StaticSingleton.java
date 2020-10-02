package com.qxf.singleton;

// 单例：静态内部类实现
public class StaticSingleton {
    // 构造器私有
    private StaticSingleton(){};

    // 通过静态内部类返回实例对象
    public static StaticSingleton getStaticSingleton(){
        return InstanceClass.staticSingleton;
    }

    // 静态内部类在类加载阶段，实例化对象
    public static class InstanceClass{
        private final static StaticSingleton staticSingleton = new StaticSingleton();
    }

}
