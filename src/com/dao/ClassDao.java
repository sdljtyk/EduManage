package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Class;
import com.model.Student;
import com.model.StudentClass;
import com.model.Teacher;
import com.util.HibernateSessionFactory;

public class ClassDao {
	public boolean addClass(Class class1) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.save(class1);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println("ClassDao中addClass异常");
			return false;
		}finally{
			session.close();
		}
	}

	public ArrayList<Class> findAllClass() {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Class";
		try {
			
	        query=session.createQuery(hqlsql);
	        List<Class> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Class>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findAllClass异常");
			return null;
		}finally{
			session.close();
		}
	}

	public ArrayList<StudentClass> findChooseClass(Student s) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from StudentClass as sc where sc.SId='"+s.getSId()+"'";
		try {
	        query=session.createQuery(hqlsql);
	        List<StudentClass> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<StudentClass>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findChooseClass异常");
			return null;
		}finally{
			session.close();
		}
	}

	public Class findByID(Integer cId) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			Class c=(Class)session.get(Class.class, cId);
			tc.commit();
			return c;
		}catch(Exception e){
			System.out.println("ClassDao中findByID异常");
			return null;
		}finally{
			session.close();
		}
	}

	public boolean delStudentClass(StudentClass stuclass) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.delete(stuclass);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println("ClassDao中delStudentClass异常");
			return false;
		}finally{
			session.close();
		}
	}

	public boolean UpdateInfo(Class cla) {
		Session session= HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try {
			session.update(cla);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("ClassDao中UpdateInfo异常");
			return false;
		}finally{
			session.close();
		}
	}

	public boolean ChooseClass(StudentClass stuclass) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.save(stuclass);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println("ClassDao中ChooseClass异常");
			return false;
		}finally{
			session.close();
		}
	}

	public StudentClass findByCIdandSid(Integer sId, Integer cId) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from StudentClass as sc where sc.CId=? and sc.SId=?";
		try {
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, cId);
	        query.setParameter(1, sId);
	        List<StudentClass> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        if(list.size()<=0)
	        	return null;
	        else
	        	return list.get(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findByCIdandSid异常");
			return null;
		}finally{
			session.close();
		}
	}

	public ArrayList<Class> findByTid(Teacher t) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Class as c where c.TId=? and c.CStatus=1";
		try {
			
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, t.getTId());
	        List<Class> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Class>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findByTid异常");
			return null;
		}finally{
			session.close();
		}
	}

	public ArrayList<Class> findClassedByTid(Teacher t) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from Class as c where c.TId=? and c.CStatus=2";
		try {
			
	        query=session.createQuery(hqlsql);
	        query.setParameter(0, t.getTId());
	        List<Class> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Class>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findClassedByTid异常");
			return null;
		}finally{
			session.close();
		}
	}

	public ArrayList<StudentClass> findStuClaByCId(Integer cId) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hqlsql="from StudentClass as sc where sc.CId='"+cId+"'";
		try {
	        query=session.createQuery(hqlsql);
	        List<StudentClass> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<StudentClass>) list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ClassDao中findStuClaByCId异常");
			return null;
		}finally{
			session.close();
		}
	}

	public boolean UpdateStuCla(StudentClass temp1) {
		Session session= HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try {
			session.update(temp1);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("ClassDao中UpdateStuCla异常");
			return false;
		}finally{
			session.close();
		}
	}

	public boolean delClass(Class temp) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tc=session.beginTransaction();
		try{
			session.delete(temp);
			tc.commit();
			return true;
		}catch(Exception e){
			System.out.println("ClassDao中delClass异常");
			return false;
		}finally{
			session.close();
		}
	}
	public ArrayList<Class> cla_findLike(String likeName) {
		Query query;
		Session session=HibernateSessionFactory.getSession();
		String hql="from Class as c where c.CName like :sname"; 
		try {
	        query=session.createQuery(hql);
	        query.setString("sname", "%"+likeName+"%");  
	        List<Class> list=query.list();
	        Transaction transaction=session.beginTransaction();
	        transaction.commit();
	        return (ArrayList<Class>)list;
		} catch (Exception e) {
			System.out.println("ClassDao中cla_findLike异常");
			return null;
		}
	}
}
