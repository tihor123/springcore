package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");

//        Samosa s1 = (Samosa) context.getBean("s1");
//        System.out.println(s1);
        // This is required to call the destroy method of the bean.
        context.registerShutdownHook();

//        System.out.println("-------------------------------------");
//
//        Pepsi p1 = (Pepsi) context.getBean("p1");
//        System.out.println(p1);
        Example ex = (Example) context.getBean("example");
        System.out.println(ex);
    }
}
