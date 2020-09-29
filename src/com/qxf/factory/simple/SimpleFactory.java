package com.qxf.factory.simple;

public class SimpleFactory {
    public static Car getCar(String type){
        if ("BWM".equals(type)){
            return new BWM();
        }else if ("BYD".equals(type)){
            return new BYD();
        }else {
            System.out.println("输入的类型不正确");
            return null;
        }
    }
}
