package com.example.designmodel.builder;

/**
 * 在了解之前，先假设有一个问题，我们需要创建一个学生对象，
 * 属性有name,number,class,sex,age,school等属性，如果每一个属性都可以为空，
 * 也就是说我们可以只用一个name,也可以用一个school,name,或者一个class,number，
 * 或者其他任意的赋值来创建一个学生对象，这时该怎么构造
 *
 * （1）、在要构建类的内部，创建一个静态内部类Builder；
 *
 * （2）、静态内部类的属性要与构建类的属性一致；
 *
 * （3）、构建类的构造参数是静态内部类，使用静态内部类的变量为构建类逐一赋值；
 *
 * （4）、静态内部类提供参数的setter方法，并且返回值是当前Builder对象；
 *
 * （5）、最终提供一个build方法new出来一个构建类的对象，参数是当前Builder对象
 * @author peter
 * @version 1.1
 * @date 2019/9/10 17:25
 */
public class SysUser {
    //定义变量
    private final String userName;
    private String userAddress;
    private Integer sex;
    private Integer age;

    //定义构造函数
    private SysUser(Builder builder) {
        this.userName = builder.userName;
        this.userAddress = builder.userAddress;
        this.sex = builder.sex;
        this.age = builder.age;
    }

    //定义内部类 构建类
    static class Builder {
        private final String userName;
        private String userAddress;
        private Integer sex;
        private Integer age;

        public Builder (String val) {
            this.userName = val;
        }

        public Builder setUserAddress(String val) {
            this.userAddress = val;
            return this;
        }

        public Builder setSex(Integer val) {
            this.sex = val;
            return this;
        }

        public Builder setAge(Integer val) {
            this.age = val;
            return this;
        }

        public SysUser build() {            //内部类里 new实体类
            return new SysUser(this);
        }

    }


    public static void main(String[] str){
        SysUser user = new SysUser.Builder("zhangsan").setAge(26).setSex(1).build();
    }

}
