package com.niit.testcases;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;


public class UserDAOTestCase {

	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static UserDAO userDAO;
	
	@Autowired
	private static User user;
	
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		//scan the complete package and check for annoations like
		//@Component, @Controller, @Repository, @Service
		context.scan("com.niit"); 
		//clear the context(bean factory, and recreate all the
		//instances of the classes which are there in com.niit
		//with proper annotations.
		context.refresh();
		//ask the context to get instance of UserDAO
		userDAO = (UserDAO)context.getBean("userDAO");
		user = (User)context.getBean("user");
	}
	@Ignore
	
	@Test
	public void saveUserTestCase()
	{
		user = new User();
		user.setEmailID("meghana@gmail.com");
		user.setMobile("9848660750");
		user.setName("Meghana");
		user.setPwd("meghana@123");
		
	  boolean status = 	userDAO.save(user);
	  
	  assertEquals("save user test case", true, status);
	}
	
	@Ignore
	
	@Test
	public void updateUserTestCase()
	{
		user.setEmailID("meghana@gmail.com");
		user.setMobile("888888888");
		boolean status = userDAO.update(user);
		assertEquals("update test case", true,status );
	}
	@Ignore
	
	@Test
	public void getUserSuccessTestCase()
	{
		
	user= userDAO.get("meghana@gmail.com");
	
	assertNotNull("get user test case", user);
	}
	
	@Ignore
	
	@Test
	public void getUserFailureTestCase()
	{
		
	user= userDAO.get("meghana@gmail.com");
	
	assertNull("get user test case", user);
	}
	
	@Ignore
	
	@Test
	public void deleteUserSuccessTestCase()
	{
	boolean status =	userDAO.delete("meghana@gmail.com");
	assertEquals("delete user succss test case" , true, status);
	
	}
	@Ignore
	
	@Test
	public void deleteUserFailureTestCase()
	{
	boolean status =	userDAO.delete("meghana@gmail.com");
	assertEquals("delete user failure test case" , false, status);
	
	}
	
	@Ignore
	
	@Test
	public void getAllUsersTestCase()
	{
	List<User>	users = userDAO.list();
	
	assertEquals("get all usres " , 3, users.size() );
	
	}
	@Ignore
	
	@Test
	public void validateCredentailsTestCase()
	{
	user = 	userDAO.validate("meghana@gmail.com", "meghana@123");
	assertNotNull("Validate test case",user );
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
