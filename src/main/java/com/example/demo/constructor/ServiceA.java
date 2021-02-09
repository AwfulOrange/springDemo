package com.example.demo.constructor;

import org.springframework.stereotype.Component;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
@Component
public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
