package com.qxf.strategy;

public class Discount9 extends Discount{
    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice*0.9;
    }

    @Override
    public String discountDesc() {
        return "打九折";
    }
}
