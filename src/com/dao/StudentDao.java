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

@SuppressWarnings("deprecation")
public class StudentDao {

	public Student findByName(String username) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Student as u where u.SName=?";
		try {
			
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, username);
	        List<Student> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        if(list.size()<=0)
	        	return null;
	        else{
	        	Student a=(Student)list.get(0);
	        	return a;
	        }	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("StudentDao中findByName异常");
			return null;
		}finally{
			session.close();
		}
	}

	public boolean addStudent(Student student) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.save(student);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("StudentDao中addStudent异常");
			return false;
		}finally{
			session.close();
		}
	}

	public ArrayList<Student> findAllStu() {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Student";
		try {
			
	        query=session.createQuery(hqlsql);
	        List<Student> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Student>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("StudentDao中findAllStu异常");
			return null;
		}finally{
			session.close();
		}
	}

	public boolean updateInfo(Student s) {
		Session session= HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try {
			session.update(s);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("StudentDao中updateInfo异常");
			return false;
		}finally{
			session.close();
		}
	}

	public Student findById(Integer sId) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			Student c=(Student)session.get(Student.class, sId);
			tc.commit();
			return c;
		}catch(Exception e){
			System.out.println("StudentDao中findById异常");
			return null;
		}finally{
			session.close();
		}
	}
	
	public boolean delStudent(Student s) {

		Session session = HibernateSessionFactory.getSession();
		Transaction tc = session.beginTransaction();
		try {
			session.delete(s);
			tc.commit();
			return true;
		} catch (Exception e) {
			System.out.println("StudentDao中delStudent异常");
			return false;
		} finally {
			session.close();
		}
	}
	
	public ArrayList<Student> stu_findLike(String likeName) {
		System.out.println(likeName);
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hql="from Student as s where s.SName like :sname"; 
		try {
	        query=session.createQuery(hql);
	        query.setString("sname", "%"+likeName+"%");  
	        List<Student> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Student>)list;
		} catch (Exception e) {
			System.out.println("StudentDao中stu_findLike异常");
			return null;
		}
	}

}
