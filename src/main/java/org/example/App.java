package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //        1. Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//        2. Get a reference to the bean
        ComputerEngineer engineer = context.getBean("computerEngineer", ComputerEngineer.class);

//        Call methods on the bean
        engineer.workForWages();
    }
}
