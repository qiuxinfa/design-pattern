package com.qxf.factory.abs;


/**
 * @ClassName TestAbsFactory
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/10/4 11:12
 **/
public class TestAbsFactory {
    public static void main(String[] args) {
        CarFactory bwmFactory = new BWMFactory();
        CarEngine carEngine = bwmFactory.getCarEngine();
        CarWheel carWheel = bwmFactory.getCarWheel();
        carEngine.engine();
        carWheel.wheel();
        System.out.println("====分割线====");
        CarFactory bydFactory = new BYDFactory();
        CarEngine carEngine2 = bydFactory.getCarEngine();
        CarWheel carWheel2 = bydFactory.getCarWheel();
        carEngine2.engine();
        carWheel2.wheel();

    }
}
