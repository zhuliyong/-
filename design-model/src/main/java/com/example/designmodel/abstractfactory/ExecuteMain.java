package com.example.designmodel.abstractfactory;

/**
 * 抽象工厂类（抽象工厂的灵活性就体现在这里，无需改动原有的代码）
 * 1、抽象接口：定义了水果颜色，定义了水果的吃法
 * @author peter
 * @version 1.1
 * @date 2019/9/10 16:51
 */
public class ExecuteMain {

    public static void main(String[] str){
        //我想吃香蕉，请描述的香蕉的具体信息
        new BananaForEat().howToEat();
    }
}
