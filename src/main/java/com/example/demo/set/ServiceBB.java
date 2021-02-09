package com.example.demo.set;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
public class ServiceBB {
    private ServiceAA serviceAA;

    public void setServiceAA(ServiceAA serviceAA) {
        this.serviceAA = serviceAA;
        System.out.println("BB中set了AA");
    }
}
