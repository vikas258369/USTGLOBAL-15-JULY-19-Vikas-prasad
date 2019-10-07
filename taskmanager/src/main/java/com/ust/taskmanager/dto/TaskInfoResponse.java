package com.ust.taskmanager.dto;

import java.util.List;

public class TaskInfoResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<TaskInfo> taskList;
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<TaskInfo> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<TaskInfo> taskList) {
		this.taskList = taskList;
	}
	
	
}
