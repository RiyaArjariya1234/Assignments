package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.print(emp1.getName());
        System.out.print(emp1.getPhones());
        System.out.print(emp1.getAddresses());
        System.out.print(emp1.getCourses());
        
    	
    	
    	
    	
	}

}
