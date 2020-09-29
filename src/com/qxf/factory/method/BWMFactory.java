package com.qxf.factory.method;

import com.qxf.factory.simple.BWM;
import com.qxf.factory.simple.Car;

public class BWMFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BWM();
    }
}
