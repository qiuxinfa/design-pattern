package com.qxf.singleton;

public class StaticSingleton {

    private StaticSingleton(){};

    public static StaticSingleton getStaticSingleton(){
        return InstanceClass.staticSingleton;
    }

    public static class InstanceClass{
        private final static StaticSingleton staticSingleton = new StaticSingleton();
    }

}
