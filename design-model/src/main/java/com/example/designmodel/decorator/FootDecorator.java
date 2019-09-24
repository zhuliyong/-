package com.example.designmodel.decorator;

/**
 * 新的方法,不影响老的方法的运行
 * 对 dogfoot添加颜色的方法
 * @author peter
 * @version 1.1
 * @date 2019/9/12 14:27
 */
public class FootDecorator implements Foot {

    protected Foot foot;

    public FootDecorator(Foot foot){
        this.foot = foot;
    }

    /**
     * 该造老功能，实现新的功能
     */
    @Override
    public void outFoodNum() {
        foot.outFoodNum();
        getColor();
    }

    /*添加新的方法*/
    private void getColor(){
        System.out.println("我添加了方法");
    }


    public static void main(String[] arg){
        FootDecorator newDogFoot = new FootDecorator(new DogFoot());
        System.out.println("====FootDecorator=========输出新的功能:");
        newDogFoot.outFoodNum();
        System.out.println("================================================");
        System.out.println("====DogFoot=========输出老的功能");
        DogFoot dogFoot = new DogFoot();
        dogFoot.outFoodNum();
    }
}
