package com.qxf.strategy;

public class DiscountReturningCash extends Discount{
    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice > 10 ? (originalPrice-10) : originalPrice;
    }

    @Override
    public String discountDesc() {
        return "满10元减2元";
    }
}
