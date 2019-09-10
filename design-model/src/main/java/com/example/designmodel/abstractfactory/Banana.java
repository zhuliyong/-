package com.example.designmodel.abstractfactory;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/10 16:45
 */
public class Banana implements Food {
    @Override
    public void color() {
        System.out.println("banana is yellow");
    }
}
