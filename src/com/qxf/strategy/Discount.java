package com.qxf.strategy;

public abstract class Discount {
    protected double finalPrice;
    protected String name;
    public abstract double calculatePrice(double originalPrice);
    public abstract String discountDesc();
}
