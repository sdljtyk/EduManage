package com.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.model.Admin;
import com.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;

public class StudentAction extends ActionSupport implements SessionAware{
	private Student student;
	private File file;
	private String  newpass;
	private String msg;
	private String fileFileName;
	private ArrayList<Student> stu;
	private Map<String,Object> session;
	private String likeName;
	private StudentService ss=new StudentService();
	
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileName() {
		return fileFileName;
	}

	public void setFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public ArrayList<Student> getStu() {
		return stu;
	}

	public void setStu(ArrayList<Student> stu) {
		this.stu = stu;
	}

	
	public String getLikeName() {
		return likeName;
	}

	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public String getNewpass() {
		return newpass;
	}

	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}
	
	public String AddStudent()
	{
		String realpath = ServletActionContext.getServletContext().getRealPath(
				"/uploads");
		if (file != null) {
			File savefile = new File(new File(realpath), fileFileName);
			if (!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
			try {
				FileUtils.copyFile(file, savefile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		student.setSImage(fileFileName);
		student.setSPass("123456");
		student.setSMaxclass(100);
		if(ss.addStudent(student))
			return "success";
		else
			return "input";
	}
	public String findAllStu()
	{
		this.stu=ss.findAllStu();
		return "success";
	}
	public String updateInfo()
	{
		Student s=(Student)session.get("student");
		s.setSName(student.getSName());
		s.setSSex(student.getSSex());
		s.setSFrom(student.getSFrom());
		s.setSEmail(student.getSEmail());
		s.setSTel(student.getSTel());
		if(ss.updateInfo(s)){
			session.put("student", s);
			return "success";
		}
		return "input";
	}
	
	public String UpdatePass()
	{
		Student s=(Student)session.get("student");
		if(s.getSPass().equals(student.getSPass())){
			s.setSPass(newpass);
			if(ss.updatePass(s)){
				session.put("student", s);
				return "success";
			}
		}
		setMsg("原密码不正确！");
		return "input";
		
	}
	
	public String delStudent()
	{
		if(ss.delStudent(student))
			return "success";
		else
			return "input";
	}
	
	public String stu_findLike()
	{
		this.stu=ss.stu_findLike(likeName);
		System.out.println(stu.size());
		return "success";
	}
	
}
