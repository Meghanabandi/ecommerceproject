package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

@Repository("supplierDAO")
	@Transactional

	public class SupplierDAOImpl implements SupplierDAO 
	{

		@Autowired
		private SessionFactory sessionFactory;
		
		public SupplierDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory = sessionFactory;
		}

		public boolean save(Supplier supplier) {
			try
			{
			sessionFactory.getCurrentSession().save(supplier);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
			
		public boolean delete(Supplier supplier) {
		
		try {
			sessionFactory.getCurrentSession().delete(supplier);
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				return true;
			}
		
		

		public boolean update(Supplier supplier) {
			try
			{
			sessionFactory.getCurrentSession().update(supplier);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		

		public List<Supplier> listSuppliers() {
			return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
			
		}
			

		public Supplier getSupplier(int supplierId) {
			  return 	(Supplier)  sessionFactory.getCurrentSession().get(Supplier.class,supplierId);

		}

		
		}
