package com.springcore.spel;

//import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class Test {

	public static void main(String args[])
	{
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		 Demo d1=context.getBean("demo",Demo.class);
		 System.out.print(d1);
		 
		 SpelExpressionParser temp=new SpelExpressionParser();
		 Expression expression =temp.parseExpression("23+23");
		 System.out.println(expression.getValue());
		 
		 
		 
		 
	}
	
}
