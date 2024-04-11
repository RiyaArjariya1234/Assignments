package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	  public static void main(String args[])
	  {
		  AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		  context.registerShutdownHook();
		  Example example=(Example)context.getBean("example");
		  System.out.println(example);
		 // Samosa s1=(Samosa)context.getBean("s1");
		 // System.out.print(s1);	
		  //registering shutdown hook
		//  System.out.println("++++++++++++++++");
		//  Pepsi p1=(Pepsi)context.getBean("p1");
		//  System.out.print(p1);
	  }

}
