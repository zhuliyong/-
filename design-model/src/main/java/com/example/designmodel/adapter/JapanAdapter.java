package com.example.designmodel.adapter;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/11 14:50
 */
public class JapanAdapter implements DC5Adapter{

    private static final int inputVollate = 110;

    @Override
    public boolean support(Ac ac) {
        return ac.outVottage() == inputVollate;
    }

    @Override
    public int outputDC5V(Ac ac) {
        System.out.println("将110V电压转成5V电压输出");
        return inputVollate/22;
    }
}
