package com.jpa.test.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	public List<User> findByName(String city);
	public List<User> findByNameAndCity(String name,String city);
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u WHERE u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("select u from User u WHERE u.name=:n and u.city=:c")
	public List<User> getUserByName(@Param("n") String name,@Param("c") String city);
	
	//Native Query
	@Query(value="select * from user",nativeQuery=true)
	public List<User> getUsers();
	

}
