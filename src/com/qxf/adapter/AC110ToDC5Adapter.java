package com.qxf.adapter;

/**
 * @ClassName AC110ToDC5Adapter
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/10/9 22:52
 **/
public class AC110ToDC5Adapter implements DC5Adapter{
    private final int voltage = 110;

    @Override
    public boolean support(AC ac) {
        return voltage == ac.output();
    }

    @Override
    public int outputDC5(AC ac) {
        return ac.output()/22;
    }
}
