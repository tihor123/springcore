package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args){
        ApplicationContext c = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo d = c.getBean("demo", Demo.class);
        System.out.println(d);

//        SpelExpressionParser parser = new SpelExpressionParser();
//        Expression ex = parser.parseExpression("22+46");
//        System.out.println(ex.getValue());
    }
}
