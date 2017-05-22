package com.service;

import java.util.ArrayList;

import com.dao.ClassDao;
import com.model.Class;
import com.model.Student;
import com.model.StudentClass;
import com.model.Teacher;

public class ClassService {

	private ClassDao cd=new ClassDao();
	public boolean insert(Class class1) {
		return cd.addClass(class1);
	}
	public ArrayList<Class> findAllClass() {
		return cd.findAllClass();
	}
	public ArrayList<StudentClass> findChooseClass(Student s) {
		return cd.findChooseClass(s);
	}
	public Class findByID(Integer cId) {
		return cd.findByID(cId);
	}
	public boolean delStudentClass(StudentClass stuclass) {
		return cd.delStudentClass(stuclass);
	}
	public boolean UpdateInfo(Class cla) {
		return cd.UpdateInfo(cla);
	}
	public boolean ChooseClass(StudentClass stuclass) {
		return cd.ChooseClass(stuclass);
	}
	public StudentClass findByCIdandSid(Integer sId, Integer cId) {
		return cd.findByCIdandSid(sId,cId);
	}
	public ArrayList<Class> findByTid(Teacher t) {
		return cd.findByTid(t);
	}
	public ArrayList<Class> findClassedByTid(Teacher t) {
		return cd.findClassedByTid(t);
	}
	public ArrayList<StudentClass> findStuClaByCId(Integer cId) {
		return cd.findStuClaByCId(cId);
	}
	public void UpdateStuCla(StudentClass temp1) {
		cd.UpdateStuCla(temp1);
	}
	public boolean delClass(Class class1) {
		Class temp = cd.findByID(class1.getCId());
		return cd.delClass(temp);
	}
	public ArrayList<Class> cla_findLike(String likeName) {
		return cd.cla_findLike(likeName);
	}
}
