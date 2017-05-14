package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StudentClass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student_class", catalog = "edumanage")
public class StudentClass implements java.io.Serializable {

	// Fields

	private Integer scId;
	private Integer CId;
	private Integer SId;
	private Integer scScore;

	// Constructors

	/** default constructor */
	public StudentClass() {
	}

	/** full constructor */
	public StudentClass(Integer CId, Integer SId, Integer scScore) {
		this.CId = CId;
		this.SId = SId;
		this.scScore = scScore;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sc_id", unique = true, nullable = false)
	public Integer getScId() {
		return this.scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	@Column(name = "c_id")
	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	@Column(name = "s_id")
	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	@Column(name = "sc_score")
	public Integer getScScore() {
		return this.scScore;
	}

	public void setScScore(Integer scScore) {
		this.scScore = scScore;
	}

}