package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
