package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * spring代码演示循环依赖
 *
 * @Author chenxiangge
 * @Date 2021/2/6
 */
@SpringBootApplication
public class ClientCode {
    public static void main(String[] args) {
        //SpringBoot获取 ApplicationContext
        ApplicationContext applicationContext = SpringApplication.run(ClientCode.class, args);
        /**
         *
         *
         * singleton-支持循环依赖
         * 如果是prototype则循环依赖报错（如下）
         *
         * Error creating bean with name 'BBB':
         * Unsatisfied dependency expressed through field 'amm';
         * nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException:
         * Error creating bean with name 'amm': Requested bean is currently in creation:
         * Is there an unresolvable circular reference?
         */
        Amm a = applicationContext.getBean(Amm.class);
        BBB b = applicationContext.getBean(BBB.class);
    }
}
