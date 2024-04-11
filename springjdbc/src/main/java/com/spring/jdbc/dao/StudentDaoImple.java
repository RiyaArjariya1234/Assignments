package com.spring.jdbc.dao;

//import javax.swing.tree.RowMapper;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

@Component("studnetDao")
public class StudentDaoImple implements StudentDao {
	
	
    private JdbcTemplate jdbcTemplate;
	public int insert(Student student)
	{
		//insert Query
        String query="insert into student(id,name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student)
	{
		//updating data
		String query="update student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentId)
	{
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId)		
	{
		//select single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	public List<Student> getAllStudents()
	{
	  String query="select * from student";
	  List<Student> students=this.jdbcTemplate.query(query,new RowMapperImpl());
	  return students;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
 
}
