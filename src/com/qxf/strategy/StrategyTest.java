package com.qxf.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Shopping shopping = new Shopping("设计模式", 69.8, new Discount9());
        double finalPrice = shopping.calculateFinalPrice();
        System.out.println(finalPrice);
    }
}
