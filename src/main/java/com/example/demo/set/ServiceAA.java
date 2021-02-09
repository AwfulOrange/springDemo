package com.example.demo.set;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
public class ServiceAA {
    private ServiceBB serviceBB;

    public void setServiceBB(ServiceBB serviceBB) {
        this.serviceBB = serviceBB;
        System.out.println("AA中set了BB");
    }
}
