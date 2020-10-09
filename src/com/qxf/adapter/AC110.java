package com.qxf.adapter;

/**
 * @ClassName AC110
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/10/9 22:45
 **/
public class AC110 implements AC{
    private final int voltage = 110;

    @Override
    public int output() {
        return voltage;
    }
}
