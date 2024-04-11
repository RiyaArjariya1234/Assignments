package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My Program Started...");
        //spring jdbc=>jdbcTemplate
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
       //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        //INSERT
     /*   Student student=new Student();
        student.setId(6661);
        student.setName("ria");
        student.setCity("Lucknow");
        
        int res=studentDao.insert(student);
        System.out.println("Student added"+res);*/
         //INSERT
       /* Student student=new Student();
        student.setId(666);
        student.setName("ria");
        student.setCity("Lucknow");
        
        int res=studentDao.insert(student);
        System.out.println("Student added"+res);*/
        
       /* JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert Query
        String query="insert into student(id,name,city) values(?,?,?)";
        //fire Query
        int res=template.update(query,456,"Uttam Kumar","Kanpur");
        System.out.println("no of record inserted"+res);*/
        //UPDATE
       /* Student student=new Student();
        student.setId(456);
        student.setName("Raj Kumar");
        student.setCity("Lucknow");
        int res=studentDao.change(student);
        System.out.print("data changed"+res);*/
        //Delete
       // int res=studentDao.delete(666);
      //  System.out.println("deleted"+res);
       // Student student=studentDao.getStudent(222);
       // System.out.println(student);
        
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students)
        {
        	System.out.println(s);
        }
    }
}
