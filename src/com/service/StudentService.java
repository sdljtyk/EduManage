package com.service;

import java.util.ArrayList;

import com.dao.StudentDao;
import com.model.Student;

public class StudentService {
	StudentDao sd=new StudentDao();
	public Student findByName(String username) {
		return sd.findByName(username);
	}
	public boolean addStudent(Student student) {
		return sd.addStudent(student);
	}
	public ArrayList<Student> findAllStu() {
		return sd.findAllStu();
	}
	public boolean updateInfo(Student s) {
		return sd.updateInfo(s);
	}
	public boolean updatePass(Student s) {
		return sd.updateInfo(s);
	}
	public Student findById(Integer sId) {
		return sd.findById(sId);
	}
	public boolean delStudent(Student student) {
		Student temp=sd.findById(student.getSId());
		return sd.delStudent(temp);
	}

}
