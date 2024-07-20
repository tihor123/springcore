package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s = context.getBean("reader", Student.class);
        System.out.println(s);
        s.study();
    }
}
