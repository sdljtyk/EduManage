package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.model.Admin;
import com.model.Class;
import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

public class AdminAction extends ActionSupport implements SessionAware {
	
	private Admin admin;
	private String  newpass;
	private String msg;
	private AdminService as = new AdminService();
	private Map<String ,Object> session;
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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
	public String admin_UpdatePass()
	{
		Admin a=(Admin)session.get("admin");
		if(a.getUserpass().equals(admin.getUserpass())){
			admin.setId(a.getId());
			admin.setUsername(a.getUsername());
			admin.setUserpass(newpass);
			if(as.updatePass(admin)){
				session.put("admin", admin);
				return "success";
			}
		}
		setMsg("原密码不正确！");
		return "input";
		
	}
	
}
