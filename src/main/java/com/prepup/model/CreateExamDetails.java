package com.prepup.model;

import java.sql.Date;

public class CreateExamDetails {


	private String eName;
	private String classId;
	private Date date;
	private Integer duration;
	private String instruction;
	
	public CreateExamDetails() {
		super();
	}

	public CreateExamDetails(String eName, String classId, Date date, Integer duration, String instruction) {
		super();
		this.eName = eName;
		this.classId = classId;
		this.date = date;
		this.duration = duration;
		this.instruction = instruction;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
	
}
