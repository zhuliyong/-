package com.example.designmodel.abstractfactory;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/10 16:49
 */
public class AppleForEat implements EatFood {
    @Override
    public void howToEat() {
        new Apple().color();
        System.out.println("苹果洗干净直接吃");
    }
}
