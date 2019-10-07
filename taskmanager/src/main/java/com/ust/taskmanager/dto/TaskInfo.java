package com.ust.taskmanager.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class TaskInfo {

	@GeneratedValue
	@Id
	@Column
	private int id;
	@Column
	private String task;
	
	//@GeneratedValue
	@Column(name = "task_start_date")
	private Date task_start_date;
	
	
	//@GeneratedValue
	@Column(name = "task_end_date")
	private Date task_end_date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getTask_end_dtate() {
		return task_end_date;
	}
	public void setTask_end_dtate(Date task_end_dtate) {
		this.task_end_date = task_end_dtate;
	}
	
	public Date getTask_start_dtate() {
		return task_start_date;
	}
	public void setTask_start_dtate(Date startdate) {
		this.task_start_date = startdate;
	}
	
	
	
}
