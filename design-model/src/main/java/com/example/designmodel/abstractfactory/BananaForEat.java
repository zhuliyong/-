package com.example.designmodel.abstractfactory;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/10 16:50
 */
public class BananaForEat implements EatFood {
    @Override
    public void howToEat() {
        new Banana().color();
        System.out.println("香蕉剥皮吃");
    }
}
