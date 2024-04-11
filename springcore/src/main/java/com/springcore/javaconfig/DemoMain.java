package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	
	public static void main(String args[])
	{
		// ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		 ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		
		// Student student=context.getBean("firstStudent",Student.class);
		 Student student=context.getBean("getStudent",Student.class);
		 System.out.println(student);
    	 student.study();
	}

}
