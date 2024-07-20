package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student s = context.getBean("student", Student.class);
//        System.out.println(s);
//        System.out.println(s.getAddress());
//        System.out.println(s.getAddress().getClass().getName());
        System.out.println(s.hashCode());

        Student s2 = context.getBean("student", Student.class);
        System.out.println(s2.hashCode());

        Teacher teacher1 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher1.hashCode());

        Teacher teacher2 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher2.hashCode());
    }
}
