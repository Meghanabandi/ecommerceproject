package com.niit.testcases;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.h2.engine.User;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;

import com.niit.model.UserDetails;

public class UserTestCase {

	/*static UserDAO userDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	
	@Ignore
	@Test
	public void addUserTest()
	{
		UserDetails user=new UserDetails();
		user.setUsername("meghna");
		user.setPassword("megha000");
		user.setRole("manufacturer");
		user.setCustomerName("ishitha");
		user.setEmailid("ishitha123@gmail.com");
		user.setMobileno("987654321");
	    user.setAddress("delhi");
		
				
		
		assertTrue("Probem in Adding the User",userDAO.save(user));
	}
	
	@Ignore
	@Test
	public void updateUserTest()
	{	
		UserDetails user=userDAO.getUserDetails(5);
		user.setAddress("Mumbai");	
		assertTrue("Problem in Updating the User",userDAO.update(user));
	}
	@Ignore
	@Test
	public void deleteUserTest()
	{
		UserDetails user=userDAO.getUserDetails(7);
		assertTrue("Problem in Delete the User",userDAO.delete(user));
	}
	
	@Test
	public void listUserTest()
	{
		List<UserDetails> listUsers=userDAO.listUserDetailss();
		
		assertTrue("Problem in Listing the Categories",listUsers.size()>0);
		
		for(UserDetails user:listUsers)
		{
			System.out.print("User name:"+user.getUsername());
		 System.out.println("password:"+user.getPassword());
			System.out.println(" role:"+user.getRole());
			System.out.println(" customername:"+user.getCustomerName());
			System.out.println(" emailId:"+user.getEmailid());
			System.out.println(" mobileno:"+user.getMobileno());
			System.out.println(" address:"+user.getAddress());
			
		}
	}
*/
}

