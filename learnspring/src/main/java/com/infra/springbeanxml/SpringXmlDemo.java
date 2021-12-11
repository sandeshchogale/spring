package com.infra.springbeanxml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringXmlDemo {

	public static void main(String[] args) {
		//Step1
		  
		Student s = new Student();
		s.setName("Calling Through Setter Method========Hello World");
		s.displayInfo();
		
		
		/*Step 2
		 * Create a applicationContext.xml in resources folder 
		 * Define the bean inside that.
		 * 
		 */
	    Resource resource=new ClassPathResource("first.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    Student s1=(Student)factory.getBean("studentbean");  
	    s1.displayInfo();  
		
		/*Step 3
		 * The new way.
		 * context doesn't provide a way to close
		 * So try catch it or don't get it into a variable
		 * ApplicationContext would be automatically closed when the application exits
		 */
		
	    ApplicationContext context= new ClassPathXmlApplicationContext("first.xml");
        Student s2= (Student) context.getBean("studentbean");								
        s2.displayInfo();
        
        
	}
}