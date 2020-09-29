package com.qxf.factory.simple;

public class TestSimpleFactory {
    public static void main(String[] args) {
        Car car = SimpleFactory.getCar("BWM");
        car.run();
    }
}
