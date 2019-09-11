package com.example.designmodel.adapter;

/**
 * 中国电压类
 * @author peter
 * @version 1.1
 * @date 2019/9/11 14:00
 */
public class ChinaAc implements Ac {

    private final int vottage = 220;

    @Override
    public int outVottage() {
        return vottage;
    }
}
