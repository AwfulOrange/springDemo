package com.example.demo.constructor;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
public class Main {
    public static void main(String[] args) {
        //构造器循环依赖，无法解决循环依赖-java代码演示
        //如果按照构造器方法，发现根本无法创建响应的对象-如下所示
        // ServiceB(new ServiceA());
    }
}
