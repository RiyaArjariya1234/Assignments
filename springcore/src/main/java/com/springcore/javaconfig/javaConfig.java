package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class javaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	@Bean
	public Student getStudent()
	{
		//creating a new student obj
		Student student =new Student(getSamosa());
		return student;
	}

}
