package com.niit.testcases;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryTestCase {

	/*
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Ignore
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryName("Electronic devices");
		category.setCategoryDesc("All kind of electronic devices");
		
		assertTrue("Problem in Adding the Category",categoryDAO.save(category));
	}
	
	@Ignore
	@Test
	public void updateCategoryTest()
	{	
		Category category=categoryDAO.getCategory(1);
		category.setCategoryDesc("");	
		assertTrue("Problem in Updating the Category",categoryDAO.update(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categoryDAO.getCategory(11);
		assertTrue("Problem in Delete the Category",categoryDAO.delete(category));
	}
	
	@Test
	public void listCategoriesTest()
	{
		List<Category> listCategories=categoryDAO.listCategories();
		
		assertTrue("Problem in Listing the Categories",listCategories.size()>0);
		
		for(Category category:listCategories)
		{
			System.out.print("Category ID:"+category.getCategoryId());
			System.out.print("   Category Name:"+category.getCategoryName());
			System.out.println("   Category Desc:"+category.getCategoryDesc());
		}
	}

	*/
}
