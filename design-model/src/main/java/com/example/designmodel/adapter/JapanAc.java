package com.example.designmodel.adapter;

/**
 * 日本电压类
 * @author peter
 * @version 1.1
 * @date 2019/9/11 14:04
 */
public class JapanAc implements Ac {
    private final int vottage = 110;

    @Override
    public int outVottage() {
        return vottage;
    }
}
