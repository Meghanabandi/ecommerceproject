package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDAO;
import com.niit.model.UserDetails;


	@Repository("userDAO")
	@Transactional

	public class UserDAOImpl implements UserDAO 
	{

		@Autowired
		private SessionFactory sessionFactory;
		
		public UserDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory = sessionFactory;
		}

	

		public boolean save(UserDetails user) {
			try
			{
			sessionFactory.getCurrentSession().save(user);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		

		public boolean delete(UserDetails user) {
			try {
				sessionFactory.getCurrentSession().delete(user);
					} catch (Exception e) {
						e.printStackTrace();
						return false;
					}
					return true;
				}
			
		
		

		public boolean update(UserDetails user) {
			try
			{
			sessionFactory.getCurrentSession().update(user);
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		public List<UserDetails> listUserDetailss() {
			return sessionFactory.getCurrentSession().createQuery("from User").list();
		
		}

		public UserDetails getUserDetails(int userId) {
			 return 	(UserDetails)  sessionFactory.getCurrentSession().get(UserDetails.class,userId);

			
		}

		
		}


