package com.qxf.adapter;

/**
 * @ClassName AC220
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/10/9 22:43
 **/
public class AC220 implements AC{
    private final int voltage = 220;

    @Override
    public int output() {
        return voltage;
    }
}
