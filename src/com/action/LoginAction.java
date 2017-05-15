package com.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.model.Admin;
import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;

public class LoginAction extends ActionSupport implements SessionAware{

	private String username;
	private String password;
	private String person;
	private String msg;
	private Map<String,Object> session;
	private AdminService as=new AdminService();
	private StudentService ss=new StudentService();
	private TeacherService ts=new TeacherService();
	private ArrayList<Teacher> teachers;
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPerson() {
		return person;
	}


	public void setPerson(String person) {
		this.person = person;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public String execute() throws Exception {
		if(this.person.equals("admin"))
		{
			Admin admin;
			admin=as.findByName(username);
			if(admin==null){
				setMsg("该用户不存在,请重新输入");
				return "input";
			}else if(admin.getUserpass().equals(password)){
				this.teachers=ts.findAllTea();
				session.put("teachers", teachers);
				session.put("person", "admin");
				session.put("admin", admin);
				return "admin";
			}else{
				setMsg("密码不正确，请重新输入");
				return "input";
			}
		}
		if(this.person.equals("teacher"))
		{
			Teacher teacher;
			teacher=ts.findByName(username);
			if(teacher==null){
				setMsg("该用户不存在,请重新输入");
				return "input";
			}else if(teacher.getTPassword().equals(password)){
				session.put("person", "teacher");
				session.put("teacher", teacher);
				return "teacher";
			}else{
				setMsg("密码不正确，请重新输入");
				return "input";
			}
		}
		if(this.person.equals("student"))
		{
			Student student;
			student=ss.findByName(username);
			if(student==null){
				setMsg("该用户不存在,请重新输入");
				return "input";
			} else if(student.getSPass().equals(password)){
				session.put("person", "student");
				session.put("student", student);
				return "student";
			}else{
				setMsg("密码不正确，请重新输入");
				return "input";
			}
		}
		return "error";
	}
	
	public String layOut()
	{
		session.clear();
		return "success";
	}
}
