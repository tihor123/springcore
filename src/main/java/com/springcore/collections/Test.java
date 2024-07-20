package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
        System.out.println(emp.getProps());
    }
}
