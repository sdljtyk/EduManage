package com.action;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.model.Class;
import com.model.Student;
import com.model.StudentClass;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ClassService;
import com.service.StudentService;

public class ClassAction extends ActionSupport implements SessionAware{
	private Class class1;
	private ArrayList<Class> classes= new ArrayList<Class>();
	private StudentClass stuclass;
	private	ArrayList<StudentClass> stuclasses= new ArrayList<StudentClass>();
	private ArrayList<Student> students = new ArrayList<Student>();
  	private ClassService cs=new ClassService();
	private Map<String,Object> session;
	private StudentService ss=new StudentService();
	private String msg;
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public StudentClass getStuclass() {
		return stuclass;
	}

	public void setStuclass(StudentClass stuclass) {
		this.stuclass = stuclass;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
	}

	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}

	public ArrayList<StudentClass> getStuclasses() {
		return stuclasses;
	}

	public void setStuclasses(ArrayList<StudentClass> stuclasses) {
		this.stuclasses = stuclasses;
	}

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String AddClass()
	{
		class1.setCStatus(1);
		class1.setCChoosed(0);
		if(cs.insert(class1))
			return "success";
		else
			return "input";
	}
	
	public String findAllClass()
	{
		this.classes=cs.findAllClass();
		return "success";
	}
	
	public String findChooseClass()
	{
		Student s=(Student)session.get("student");
		stuclasses=cs.findChooseClass(s);
		for(int i=0;i<stuclasses.size();i++)
		{
			StudentClass sc=stuclasses.get(i);
			Class c = new Class();
			c=cs.findByID(sc.getCId());
			classes.add(c);
		}
		return "success";
	}
	
	public String ChooseClass()
	{
		Class cla=cs.findByID(stuclass.getCId());
		Student s=(Student)session.get("student");
		stuclass.setSId(s.getSId());
		if(cla.getCChoosemax()-cla.getCChoosed()<1)
		{
			setMsg("该课已选满，请选择其他课程");
			ActionContext.getContext().put("msg",msg);
			return "input";
		}
		if(cla.getCStatus()==2)
		{
			setMsg("该课已结课，请选择其他课程");
			ActionContext.getContext().put("msg",msg);
			return "input";
		}
		if(cs.findByCIdandSid(s.getSId(),stuclass.getCId())!=null)
		{
			setMsg("您已经选过该课，请选择其他课程");
			ActionContext.getContext().put("msg",msg);
			return "input";
		}
		if(cs.ChooseClass(stuclass))
		{
			int temp=s.getSMarked();
			s.setSMarked(temp+cla.getCMark());
			ss.updateInfo(s);
			int temp2=cla.getCChoosed();
			cla.setCChoosed(temp2+1);
			cs.UpdateInfo(cla);	
			return "success";
		}else{
			setMsg("选课失败，请重新选课！");
			ActionContext.getContext().put("msg",msg);
			return "input";
		}
	}
	
	
	public String delStudentClass()
	{
		if(cs.delStudentClass(stuclass)){
			Class cla=cs.findByID(stuclass.getCId());
			Student s=(Student)session.get("student");
			int temp=s.getSMarked();
			s.setSMarked(temp-cla.getCMark());
			ss.updateInfo(s);
			int temp2=cla.getCChoosed();
			cla.setCChoosed(temp2-1);
			cs.UpdateInfo(cla);
			return "success";
		}
		return "input";
	}
	
	public String findClassByTid()
	{
		Teacher t = (Teacher)session.get("teacher");
		this.classes=cs.findByTid(t);
		return "success";
	}
	public String findClassedByTid()
	{
		Teacher t = (Teacher)session.get("teacher");
		this.classes=cs.findClassedByTid(t);
		return "success";
	}
	public String ClassInfo()
	{
		this.stuclasses=cs.findStuClaByCId(stuclass.getCId());
		for(int i=0;i<stuclasses.size();i++)
		{
			StudentClass sc=stuclasses.get(i);
			Student c = new Student();
			c=ss.findById(sc.getSId());
			students.add(c);
		}
		return "success";
	}
	public String tea_UpdateStuCla()
	{
		System.out.println("+++++++++++++++++++++");
		for(int i=0;i<stuclasses.size();i++)
		{
			System.out.println("-------------------------");
			System.out.println("SCid:"+stuclasses.get(i).getScId());
			System.out.println("CId:"+stuclasses.get(i).getCId());
			System.out.println("SId:"+stuclasses.get(i).getSId());
			System.out.println("ScScore:"+stuclasses.get(i).getScScore());
			
		}
		return "success";
	}
}
