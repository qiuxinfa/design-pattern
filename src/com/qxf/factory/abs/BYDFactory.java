package com.qxf.factory.abs;


public class BYDFactory implements CarFactory {

    @Override
    public CarEngine getCarEngine() {
        return new BYDEngine();
    }

    @Override
    public CarWheel getCarWheel() {
        return new BYDWheel();
    }
}
