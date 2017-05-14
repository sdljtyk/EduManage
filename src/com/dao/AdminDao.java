package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Admin;
import com.util.HibernateSessionFactory;

public class AdminDao {

	public Admin findByName(String username) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Admin as u where u.username=?";
		try {
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, username);
	        List<Admin> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        System.out.println("size:"+list.size());
	        transaction.commit();
	        if(list.size()<=0)
	        	return null;
	        else{
	        	Admin a=(Admin)list.get(0);
	        	return a;
	        }	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("AdminDao中findByName异常");
			return null;
		}finally{
			session.close();
		}
	}

	public boolean updatePass(Admin admin) {
		Session session= HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try {
			session.update(admin);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("AdminDao中updatePass异常");
			return false;
		}finally{
			session.close();
		}
	}
	
}
