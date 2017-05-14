package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "edumanage")
public class Teacher implements java.io.Serializable {

	// Fields

	private Integer TId;
	private String TName;
	private String TPassword;
	private Integer TAge;
	private String TTel;
	private String TEmail;
	private String TType;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(String TName, String TPassword, Integer TAge, String TTel,
			String TEmail, String TType) {
		this.TName = TName;
		this.TPassword = TPassword;
		this.TAge = TAge;
		this.TTel = TTel;
		this.TEmail = TEmail;
		this.TType = TType;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "t_id", unique = true, nullable = false)
	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	@Column(name = "t_name", length = 30)
	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	@Column(name = "t_password", length = 40)
	public String getTPassword() {
		return this.TPassword;
	}

	public void setTPassword(String TPassword) {
		this.TPassword = TPassword;
	}

	@Column(name = "t_age")
	public Integer getTAge() {
		return this.TAge;
	}

	public void setTAge(Integer TAge) {
		this.TAge = TAge;
	}

	@Column(name = "t_tel", length = 30)
	public String getTTel() {
		return this.TTel;
	}

	public void setTTel(String TTel) {
		this.TTel = TTel;
	}

	@Column(name = "t_email", length = 30)
	public String getTEmail() {
		return this.TEmail;
	}

	public void setTEmail(String TEmail) {
		this.TEmail = TEmail;
	}

	@Column(name = "t_type", length = 30)
	public String getTType() {
		return this.TType;
	}

	public void setTType(String TType) {
		this.TType = TType;
	}

}