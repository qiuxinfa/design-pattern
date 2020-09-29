package com.qxf.factory.method;

import com.qxf.factory.simple.Car;

public class TestFactoryMethod {
    public static void main(String[] args) {
        BWMFactory factory = new BWMFactory();
        Car car = factory.getCar();
        car.run();
    }
}
