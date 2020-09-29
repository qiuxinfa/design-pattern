package com.qxf.factory.method;

import com.qxf.factory.simple.BYD;
import com.qxf.factory.simple.Car;

public class BYDFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BYD();
    }
}
