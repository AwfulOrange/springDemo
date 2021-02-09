package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
@Component
//单例支持循环依赖 原型（多例）不支持循环依赖
//@Scope(value = "prototype")
public class BBB {
    @Autowired
    private Amm amm;

    public Amm getAaa() {
        return amm;
    }

    public void setAaa(Amm amm) {
        this.amm = amm;
    }

    public BBB() {
        System.out.println("----------create BBB success");
    }
}
