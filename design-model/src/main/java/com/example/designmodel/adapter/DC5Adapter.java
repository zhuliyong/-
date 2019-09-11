package com.example.designmodel.adapter;

/**适配器接口
 * 其中 support() 方法用于检查输入的电压是否与适配器匹配，
 * outputDC5V() 方法则用于将输入的电压变换为 5V 后输出
 * @author peter
 * @version 1.1
 * @date 2019/9/11 14:07
 */
public interface DC5Adapter {
    boolean support(Ac ac);
    int outputDC5V(Ac ac);
}
