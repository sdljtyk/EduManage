package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "class", catalog = "edumanage")
public class Class implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CName;
	private Integer TId;
	private Integer CChoosemax;
	private Integer CMark;
	private Integer CChoosed;
	private String CRoom;
	private String CTime;
	private String CDepartment;
	private Integer CStatus;

	// Constructors

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(String CName, Integer TId, Integer CChoosemax, Integer CMark,
			Integer CChoosed, String CRoom, String CTime, String CDepartment,
			Integer CStatus) {
		this.CName = CName;
		this.TId = TId;
		this.CChoosemax = CChoosemax;
		this.CMark = CMark;
		this.CChoosed = CChoosed;
		this.CRoom = CRoom;
		this.CTime = CTime;
		this.CDepartment = CDepartment;
		this.CStatus = CStatus;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "c_id", unique = true, nullable = false)
	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	@Column(name = "c_name", length = 30)
	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	@Column(name = "t_id")
	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	@Column(name = "c_choosemax")
	public Integer getCChoosemax() {
		return this.CChoosemax;
	}

	public void setCChoosemax(Integer CChoosemax) {
		this.CChoosemax = CChoosemax;
	}

	@Column(name = "c_mark")
	public Integer getCMark() {
		return this.CMark;
	}

	public void setCMark(Integer CMark) {
		this.CMark = CMark;
	}

	@Column(name = "c_choosed")
	public Integer getCChoosed() {
		return this.CChoosed;
	}

	public void setCChoosed(Integer CChoosed) {
		this.CChoosed = CChoosed;
	}

	@Column(name = "c_room", length = 40)
	public String getCRoom() {
		return this.CRoom;
	}

	public void setCRoom(String CRoom) {
		this.CRoom = CRoom;
	}

	@Column(name = "c_time", length = 40)
	public String getCTime() {
		return this.CTime;
	}

	public void setCTime(String CTime) {
		this.CTime = CTime;
	}

	@Column(name = "c_department", length = 40)
	public String getCDepartment() {
		return this.CDepartment;
	}

	public void setCDepartment(String CDepartment) {
		this.CDepartment = CDepartment;
	}

	@Column(name = "c_status")
	public Integer getCStatus() {
		return this.CStatus;
	}

	public void setCStatus(Integer CStatus) {
		this.CStatus = CStatus;
	}

}