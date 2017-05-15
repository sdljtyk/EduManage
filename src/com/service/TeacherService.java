package com.service;

import java.util.ArrayList;

import com.dao.TeacherDao;
import com.model.Teacher;

public class TeacherService {

	TeacherDao td=new TeacherDao();
	public Teacher findByName(String username) {
		return td.findByName(username);
	}
	public boolean addTeacher(Teacher teacher) {
		return td.addTeacher(teacher);
	}
	public ArrayList<Teacher> findAllTea() {
		return td.findAllTea();
	}
	public boolean updatePass(Teacher t) {
		return td.updateInfo(t);
	}
	public boolean updateInfo(Teacher teacher) {
		return td.updateInfo(teacher);
	}
	public boolean delTeacher(Teacher teacher) {
		Teacher temp=td.findById(teacher.getTId());
		return td.delTeacher(temp);
	}

}
