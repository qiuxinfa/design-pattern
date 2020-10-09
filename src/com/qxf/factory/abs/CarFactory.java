package com.qxf.factory.abs;

// 抽象工厂
public interface CarFactory {
    // 获取发动机
    CarEngine getCarEngine();
    // 获取方向盘
    CarWheel getCarWheel();
}
