package com.example.designmodel.decorator;

/**
 * 旧的方法
 * @author peter
 * @version 1.1
 * @date 2019/9/12 14:26
 */
public class DogFoot implements  Foot {

    @Override
    public void outFoodNum() {
        System.out.println("dog has 4 foots");
    }
}
