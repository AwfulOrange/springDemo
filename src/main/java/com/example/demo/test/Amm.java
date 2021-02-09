package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author chenxiangge
 * @Date 2021/2/6
 */
@Component
//@Scope(value = "prototype")
public class Amm {
    @Autowired
    private BBB bbb;

    public BBB getBbb() {
        return bbb;
    }

    public void setBbb(BBB bbb) {
        this.bbb = bbb;
    }

    public Amm() {
        System.out.println("----------create Amm success");
    }

}
