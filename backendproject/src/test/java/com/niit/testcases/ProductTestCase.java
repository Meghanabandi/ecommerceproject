package com.niit.testcases;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductTestCase {

	static ProductDAO productDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductName("Samsung");
		product.setProductDesc("All kind of Samsung Smartphones");
		
		
		assertTrue("Probem in Adding the Product",productDAO.save(product));
	}
	
	@Ignore
	@Test
	public void updateProductTest()
	{	
		Product product=productDAO.getProduct(13);
		product.setProductDesc("All kind of SamsungGalaxy Smartphones");	
		product.setStock(70);
		product.setCategoryid(8);
		product.setSupplierid(9);
		product.setPrice(30000);
		
		assertTrue("Problem in Updating the Product",productDAO.update(product));
	}
	//@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(34);
		assertTrue("Problem in Delete the Product",productDAO.delete(product));
	}
	
	
	
	@Test
	public void listproductsTest()
	{
		List<Product> listProducts=productDAO.listProducts();
		
		assertTrue("Problem in Listing the Categories",listProducts.size()>0);
		
		for(Product product:listProducts)
		{
			System.out.print("Product ID:"+product.getProductId());
			System.out.print("   Product Name:"+product.getProductName());
			System.out.println("   Product Desc:"+product.getProductDesc());
		}
	}

	
}


