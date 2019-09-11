package com.example.designmodel.adapter;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/11 14:46
 */
public class ChinaAdapter implements DC5Adapter {

    private final  int inputVollate = 220;

    @Override
    public boolean support(Ac ac) {
        return ac.outVottage()==220;
    }

    @Override
    public int outputDC5V(Ac ac) {
        System.out.println("将220v转换成5v电压输出");
        return 220/44;
    }
}
