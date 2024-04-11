package com.proj.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

//import com.jpa.test.entities.User;
import com.proj.entity.Employee;
@Repository
public interface EmpRepo extends CrudRepository<Employee,Integer>{
	

}
