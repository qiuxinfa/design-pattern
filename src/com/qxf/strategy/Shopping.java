package com.qxf.strategy;

public class Shopping {
    private String name;
    private double price;
    private Discount discount;

    public Shopping(String name, double price, Discount discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double calculateFinalPrice(){
        String desc = discount.discountDesc();
        System.out.println(name+" "+desc);
        return discount.calculatePrice(price);
    }

}
