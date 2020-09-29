package com.qxf.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getEagerSingleton();
        EagerSingleton eagerSingleton2 = EagerSingleton.getEagerSingleton();
        System.out.println(eagerSingleton == eagerSingleton2);

        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton == lazySingleton2);

        StaticSingleton staticSingleton = StaticSingleton.getStaticSingleton();
        StaticSingleton staticSingleton2 = StaticSingleton.getStaticSingleton();
        System.out.println(staticSingleton == staticSingleton2);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(eagerSingleton == eagerSingleton2);
    }
}
