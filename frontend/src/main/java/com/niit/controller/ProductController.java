package com.niit.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;

	import com.niit.dao.ProductDAO;
	import com.niit.model.Product;

	@Controller
	public class ProductController 
	{
		@Autowired
		ProductDAO productDAO;
		
		@RequestMapping(value="/product")
		public String showProduct(Model m)
		{
			List<Product> listProducts=productDAO.listProducts();
			//binding the listProducts and sending to jsp page
			m.addAttribute("listProducts", listProducts); 
			return "Product";
		}
		
		@RequestMapping(value="/addProduct",method=RequestMethod.POST)
		public String addProductDetail(@RequestParam("productName")String productName,@RequestParam("productDesc")String productDesc,@RequestParam("price")int Price,@RequestParam("stock")int stock, Model m)
		{
			Product product=new Product();
			product.setProductName(productName);
			product.setProductDesc(productDesc);
		//  product.setCategoryid(111);
		//	product.setSupplierid();
		     product.setPrice(Price);
		     product.setStock(stock);
		     
			product.setProductDesc(productDesc);
				
			productDAO.save(product);
			
			List<Product> listProducts=productDAO.listProducts();
			//binding the listProducts and sending to jsp page
			m.addAttribute("listProducts", listProducts); 
			
			return "Product";
		}
		
		@RequestMapping(value="/deleteProduct/{productId}")
		public String deleteProduct(@PathVariable("productId")int productId,Model m)
		{
			Product product=productDAO.getProduct(productId);
			productDAO.delete(product);
			
			List<Product> listProducts=productDAO.listProducts();
			//binding the listProducts and sending to jsp page
			m.addAttribute("listProducts", listProducts); 
			return "Product";
		}
		
		@RequestMapping(value="/editProduct/{productId}")
		public String editProduct(@PathVariable("productId")int productId,Model m)
		{
			Product product=productDAO.getProduct(productId);
			m.addAttribute("product",product);
			return "UpdateProduct";
		}
		
		@RequestMapping(value="/updateProduct",method=RequestMethod.POST)
		public String updateProduct(@RequestParam("productId")int productId,@RequestParam("productName")String productName,@RequestParam("productDesc") String productDesc,Model m)
		{
			Product product=productDAO.getProduct(productId);
			
			product.setProductName(productName);
			product.setProductDesc(productDesc);
			
			productDAO.update(product);
			
			List<Product> listProducts=productDAO.listProducts();
			//binding the listProducts and sending to jsp page
			m.addAttribute("listProducts", listProducts); 
			return "Product";
		}
		
	}



