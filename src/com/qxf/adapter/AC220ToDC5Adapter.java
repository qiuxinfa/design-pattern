package com.qxf.adapter;

/**
 * @ClassName AC220ToDC5Adapter
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/10/9 22:51
 **/
public class AC220ToDC5Adapter implements DC5Adapter{
    private final int voltage = 220;

    @Override
    public boolean support(AC ac) {
        return voltage == ac.output();
    }

    @Override
    public int outputDC5(AC ac) {
        return ac.output()/44;
    }
}
