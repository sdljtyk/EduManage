package com.service;

import com.dao.AdminDao;
import com.model.Admin;

public class AdminService {
	
	AdminDao ad=new AdminDao();
	public Admin findByName(String username) {
		return ad.findByName(username);
	}
	public boolean updatePass(Admin admin) {
		return ad.updatePass(admin);
	}

}
