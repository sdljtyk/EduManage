package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Class;
import com.model.Student;
import com.model.Teacher;
import com.util.HibernateSessionFactory;

public class TeacherDao {

	public Teacher findByName(String username) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Teacher as t where t.TName=?";
		try {
			
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, username);
	        List<Teacher> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        if(list.size()<=0)
	        	return null;
	        else{
	        	Teacher a=(Teacher)list.get(0);
	        	return a;
	        }	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TeacherDao中findByName异常");
			return null;
		}finally{
			session.close();
		}
	}
	public boolean addTeacher(Teacher teacher) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.save(teacher);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("TeacherDao中addTeacher异常");
			return false;
		}finally{
			session.close();
		}
	}
	public ArrayList<Teacher> findAllTea() {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Teacher";
		try {
			
	        query=session.createQuery(hqlsql);
	        List<Teacher> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Teacher>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("StudentDao中findAllStu异常");
			return null;
		}finally{
			session.close();
		}
	}
	public boolean updateInfo(Teacher t) {
		Session session= HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try {
			session.update(t);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("TeacherDao中updateInfo异常");
			return false;
		}finally{
			session.close();
		}
	}

	public boolean delTeacher(Teacher t) {

		Session session = HibernateSessionFactory.getSession();
		Transaction tc = session.beginTransaction();
		try {
			session.delete(t);
			tc.commit();
			return true;
		} catch (Exception e) {
			System.out.println("TeacherDao中delTeacher异常");
			return false;
		} finally {
			session.close();
		}

	}
	public Teacher findById(Integer tId) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			Teacher t=(Teacher)session.get(Teacher.class, tId);
			tc.commit();
			return t;
		}catch(Exception e){
			System.out.println("TeacherDao中findById异常");
			return null;
		}finally{
			session.close();
		}
	}

}
