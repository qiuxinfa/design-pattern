package com.qxf.factory.abs;


public class BWMFactory implements CarFactory {

    @Override
    public CarEngine getCarEngine() {
        return new BWMEngine();
    }

    @Override
    public CarWheel getCarWheel() {
        return new BWMWheel();
    }
}
