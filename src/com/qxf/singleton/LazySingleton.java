package com.qxf.singleton;

// 单例：懒汉式，双重检验锁
public class LazySingleton {
    // 被volatile修饰的成员变量可以确保多个线程都能够正确处理
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton(){};

    public static LazySingleton getLazySingleton(){
        // 第一重判断
        if (lazySingleton == null){
            // 加锁
            synchronized (LazySingleton.class){
                // 第二重判断
                if (lazySingleton == null){
                    // new 对象
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
