package com.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "edumanage")
public class Student implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String SName;
	private String SNo;
	private String SSex;
	private String SPass;
	private Integer SMark;
	private Integer SMarked;
	private String SFrom;
	private String SEmail;
	private String STel;
	private Integer SMaxclass;
	private String SImage;
	private String SDepartment;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer SId) {
		this.SId = SId;
	}

	/** full constructor */
	public Student(Integer SId, String SName, String SNo, String SSex,
			String SPass, Integer SMark, Integer SMarked, String SFrom,
			String SEmail, String STel, Integer SMaxclass, String SImage,
			String SDepartment) {
		this.SId = SId;
		this.SName = SName;
		this.SNo = SNo;
		this.SSex = SSex;
		this.SPass = SPass;
		this.SMark = SMark;
		this.SMarked = SMarked;
		this.SFrom = SFrom;
		this.SEmail = SEmail;
		this.STel = STel;
		this.SMaxclass = SMaxclass;
		this.SImage = SImage;
		this.SDepartment = SDepartment;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "s_id", unique = true, nullable = false)
	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	@Column(name = "s_name", length = 30)
	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	@Column(name = "s_no", length = 30)
	public String getSNo() {
		return this.SNo;
	}

	public void setSNo(String SNo) {
		this.SNo = SNo;
	}

	@Column(name = "s_sex", length = 10)
	public String getSSex() {
		return this.SSex;
	}

	public void setSSex(String SSex) {
		this.SSex = SSex;
	}

	@Column(name = "s_pass", length = 30)
	public String getSPass() {
		return this.SPass;
	}

	public void setSPass(String SPass) {
		this.SPass = SPass;
	}

	@Column(name = "s_mark")
	public Integer getSMark() {
		return this.SMark;
	}

	public void setSMark(Integer SMark) {
		this.SMark = SMark;
	}

	@Column(name = "s_marked")
	public Integer getSMarked() {
		return this.SMarked;
	}

	public void setSMarked(Integer SMarked) {
		this.SMarked = SMarked;
	}

	@Column(name = "s_from", length = 50)
	public String getSFrom() {
		return this.SFrom;
	}

	public void setSFrom(String SFrom) {
		this.SFrom = SFrom;
	}

	@Column(name = "s_email", length = 50)
	public String getSEmail() {
		return this.SEmail;
	}

	public void setSEmail(String SEmail) {
		this.SEmail = SEmail;
	}

	@Column(name = "s_tel", length = 20)
	public String getSTel() {
		return this.STel;
	}

	public void setSTel(String STel) {
		this.STel = STel;
	}

	@Column(name = "s_maxclass")
	public Integer getSMaxclass() {
		return this.SMaxclass;
	}

	public void setSMaxclass(Integer SMaxclass) {
		this.SMaxclass = SMaxclass;
	}

	@Column(name = "s_image", length = 50)
	public String getSImage() {
		return this.SImage;
	}

	public void setSImage(String SImage) {
		this.SImage = SImage;
	}

	@Column(name = "s_department")
	public String getSDepartment() {
		return this.SDepartment;
	}

	public void setSDepartment(String SDepartment) {
		this.SDepartment = SDepartment;
	}

}