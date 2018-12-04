package com.niit.daoimpl;



	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import com.niit.dao.ProductDAO;
	import com.niit.model.Product;


	@Repository("productDAO")
	@Transactional

	public class ProductDAOImpl  implements ProductDAO
	{
		
		@Autowired
		private SessionFactory sessionFactory;
		
		public ProductDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory = sessionFactory;
		}
		
		public boolean save(Product product) {
			try
			{
			sessionFactory.getCurrentSession().save(product);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public boolean update(Product product) {
			try
			{
			sessionFactory.getCurrentSession().update(product);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public boolean delete(Product product) {
					try {
		sessionFactory.getCurrentSession().delete(product);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		
	
		public Product getProduct(int productId) {
			
			  return 	(Product)  sessionFactory.getCurrentSession().get(Product.class,productId);

		}

		public List<Product> listProducts() {

			return sessionFactory.getCurrentSession().createQuery("from Product").list();
			
		}


	}




