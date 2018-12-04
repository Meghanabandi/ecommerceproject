package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
public boolean save(Product product);
	
	public boolean delete(Product product);
	public boolean update(Product product);
	public List<Product> listProducts();
	public Product getProduct(int productId);

}

