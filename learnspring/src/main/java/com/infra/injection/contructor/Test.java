package com.infra.injection.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
    public static void main(String[] args) {  
          
	    ApplicationContext context= new ClassPathXmlApplicationContext("constructor.xml");
        Employee emp= (Employee) context.getBean("emp3");//emp,emp1,emp2,emp3
        emp.show();
          
    }  
}  