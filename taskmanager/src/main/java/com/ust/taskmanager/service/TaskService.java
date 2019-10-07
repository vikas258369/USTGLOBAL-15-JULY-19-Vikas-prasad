package com.ust.taskmanager.service;

import java.util.List;

import com.ust.taskmanager.dto.TaskInfo;


public interface TaskService {

	public boolean addtask(TaskInfo taskinfo);
	public boolean removetask(int id);
	public boolean updatetask(TaskInfo taskinfo);
	public List<TaskInfo> showAllTask();
	
	
}
