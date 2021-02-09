package com.example.demo.constructor;

import org.springframework.stereotype.Component;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
@Component
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
