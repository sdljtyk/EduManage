package com.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;
import com.service.TeacherService;

public class TeacherAction extends ActionSupport implements SessionAware{
	private Teacher teacher;
	private ArrayList<Teacher> tea;
	private TeacherService ts=new TeacherService();
	private Map<String,Object> session;
	private String msg;
	private String newpass;
	
	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Teacher> getTea() {
		return tea;
	}


	public void setTea(ArrayList<Teacher> tea) {
		this.tea = tea;
	}


	public String getMsg() {
		return msg;
	}
	

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public String getNewpass() {
		return newpass;
	}


	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}
	
	public String AddTeacher()
	{
		teacher.setTPassword("123456");
		if(ts.addTeacher(teacher))
			return "success";
		else
			return "input";
	}
	
	public String findAllTea()
	{
		this.tea=ts.findAllTea();
		return "success";
	}
	
	public String updateInfo()
	{
		Teacher t=(Teacher)session.get("teacher");
		teacher.setTId(t.getTId());
		teacher.setTType(t.getTType());
		teacher.setTPassword(t.getTPassword());
		if(ts.updateInfo(teacher)){
			session.put("teacher", teacher);
			return "success";
		}
		return "input";
	}
	public String UpdatePass()
	{
		Teacher t=(Teacher)session.get("teacher");
		if(t.getTPassword().equals(teacher.getTPassword())){
			t.setTPassword(newpass);
			if(ts.updatePass(t)){
				session.put("teacher", t);
				return "success";
			}
		}
		setMsg("原密码不正确！");
		return "input";
	}
	
	public String delTeacher()
	{
		if(ts.delTeacher(teacher))
			return "success";
		else
			return "input";
	}
}
