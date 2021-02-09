package com.example.demo.set;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
public class Main {
    public static void main(String[] args) {
        //set方法-可以解决循环依赖-java代码演示
        ServiceAA serviceAA = new ServiceAA();
        ServiceBB serviceBB = new ServiceBB();

        serviceAA.setServiceBB(serviceBB);
        serviceBB.setServiceAA(serviceAA);
    }
}
