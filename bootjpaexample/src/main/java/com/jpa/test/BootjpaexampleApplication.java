package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import com.jpa.test.entities.User;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	 ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	 UserRepository userRepository=context.getBean(UserRepository.class);
	 
	// User user=new User();
	// User user=new User();
	/* user.setName("Riya Arjariya");
	 user.setCity("Delhi");
	 user.setStatus("Hello I am java programmer");
	 
	 User user1=userRepository.save(user);
	 System.out.print(user1);*/
	 //Create object of user
/*	 User user1=new User();
	 user1.setName("Uttam");
	 user1.setCity("City1");
	 user1.setStatus("Python Programmer");
	 
	 User user2=new User();
	 user2.setName("Ankit");
	 user2.setCity("Mishra");
	 user2.setStatus("C++ Programmer");
	 
	 //Saving the multiple user
	 List<User> users=List.of(user1,user2);
	 Iterable<User> result=userRepository.saveAll(users);
	 result.forEach(user->{
		 
		 System.out.println(user);
		 
		 
	 });*/
	 
	 //it is used for saving the single user only..
	// User resultUser= userRepository.save(user2);
	// System.out.println("saved user"+resultUser);
	 //update the user of id 2
	/* Optional<User> optional=userRepository.findById(2);
	 User user=optional.get();
	 user.setName("Sharma");
	 User res=userRepository.save(user);
	 System.out.println(res);*/
	 //how to get the data
	 //findById(id)-return Optional Containing your data
	 //throught findAll we will return whole set of data using findAll
	/* This is the old approach of finding and printing the data
	 Iterable<User> itr=userRepository.findAll();
	 Iterator<User> iterator=itr.iterator();
	 while(iterator.hasNext())
	 {
		 User user1=iterator.next();
		 System.out.println(user1);
	 }*/
	 //New way we can do using lambda
	 /*This is the old way of doing this
	  Iterable<User> itr=userRepository.findAll();
	 itr.forEach(new Consumer<User>()
	 {
		 public void accept(User t) {
			 System.out.println(t);
		 }
		 
	 });*/
	 //This is the modern way
	// Iterable<User> itr=userRepository.findAll();
	// itr.forEach(user1->{System.out.println(user1);});
	 
	 //Deleting the user element
	// userRepository.deleteById(1);
	// System.out.println("Deleted");
	 //Delete the all element
	/* Iterable<User> allUsers=userRepository.findAll();
	 allUsers.forEach(user1->System.out.println(user1));
	 userRepository.deleteAll(allUsers);*/
	 //findAllbyId
	 //findById
	 //Driver Query methods
	 //data by name 
	 //data by name and password
	 //data by name or passowrd
	 //data name starting with prefix
	 //data by name like 'keyword'
	 
	 //select * from user where name="something"
	 //public List<User> findbyName(String name)
	//  List<User> users=userRepository.findByName("Ankit");
    //  users.forEach(e->System.out.println(e));	
	 //findByNameStartingWith(String prefix)
	 //findByNameEndingWith(String prefix)
	 //findByNameContaining(String words)
	 //findByNameLike(String likePattern)
	 //findByAgeLessThan(int age)
	 //findByAgeGreaterThanEqual(int age)
	 //findByAgeIn(Collection<Integer> ages)
	 //findByNameOrderByName(String name)
	 // List<User> users=userRepository.findByNameAndCity("Sharma","Mishra");
	//  users.forEach(e->System.out.println(e));	
	  //QUERy
	    //JPQL query
	    //native query
	    
	// List<User> allUser =userRepository.getAllUser();
	// allUser.forEach(e->System.out.println(e));	
	 
   //	 List<User> userByName =userRepository.getUserByName("Ankit");
	// userByName.forEach(e->System.out.println(e));	
	// List<User> userByName =userRepository.getUserByName("Ankit","delhi");
	 //userByName.forEach(e->System.out.println(e));	
	 
	 System.out.println("_________________________________");
	 userRepository.getUsers().forEach(e->System.out.println(e));	
	 }
  
}
