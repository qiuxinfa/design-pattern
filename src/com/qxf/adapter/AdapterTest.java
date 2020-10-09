package com.qxf.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AdapterTest
 * @Description 适配器模式测试类
 * @Author qiuxinfa
 * @Date 2020/10/9 22:22
 **/
public class AdapterTest {
    private List<DC5Adapter> dc5AdapterList = new ArrayList<>(2);
    public AdapterTest(){
        // 添加所有的适配器
        dc5AdapterList.add(new AC220ToDC5Adapter());
        dc5AdapterList.add(new AC110ToDC5Adapter());
    }

    // 查找对应的适配器
    public DC5Adapter getDC5Adapter(AC ac){
        DC5Adapter adapter = null;
        for (DC5Adapter dc5Adapter : dc5AdapterList){
            if (dc5Adapter.support(ac)){
                adapter = dc5Adapter;
                break;
            }
        }
        return adapter;
    }

    public static void main(String[] args) {
        AdapterTest test = new AdapterTest();
        // 如果现在有220v的交流电，要怎样获得5v的直流电？
        AC220 ac220 = new AC220();
        DC5Adapter adapter = test.getDC5Adapter(ac220);
        if (adapter != null){
            System.out.println("220v转换为5v");
        }
        // 如果想使用110v的
        AC110 ac110 = new AC110();
        adapter = test.getDC5Adapter(ac110);
        if (adapter != null){
            System.out.println("110v转换为5v");
        }
    }
}
