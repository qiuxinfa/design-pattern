package com.qxf.adapter;

// 直流5v适配器接口
public interface DC5Adapter {
    boolean support(AC ac);

    int outputDC5(AC ac);
}
