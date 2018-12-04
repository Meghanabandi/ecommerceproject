package com.niit.testcases;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierTestcase {

	static SupplierDAO supplierDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName("nishanth");
		supplier.setSupplierAddress("Delhi");
		
		assertTrue("Probem in Adding the Supplier",supplierDAO.save(supplier));
	}
	
	//@Ignore
	@Test
	public void updateSupplierTest()
	{	
		Supplier supplier=supplierDAO.getSupplier(5);
		supplier.setSupplierAddress("Mumbai");	
		assertTrue("Problem in Updating the Supplier",supplierDAO.update(supplier));
	}
	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier=supplierDAO.getSupplier(7);
		assertTrue("Problem in Delete the Supplier",supplierDAO.delete(supplier));
	}
	
	@Test
	public void listSupplierTest()
	{
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		
		assertTrue("Problem in Listing the Categories",listSuppliers.size()>0);
		
		for(Supplier supplier:listSuppliers)
		{
			System.out.print("Supplier ID:"+supplier.getSupplierId());
			System.out.print("   Supplier Name:"+supplier.getSupplierName());
			System.out.println("   Supplier Desc:"+supplier.getSupplierAddress());
		}
	}

}

