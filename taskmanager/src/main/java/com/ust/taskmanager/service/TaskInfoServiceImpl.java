package com.ust.taskmanager.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.taskmanager.dto.TaskInfo;
import com.ust.taskmanager.repositry.TaskRepositry;

@Service("jpa")
public class TaskInfoServiceImpl implements TaskService {

	@Autowired
	TaskRepositry repositry;

	@Override
	public boolean addtask(TaskInfo taskinfo) {
		Date startdate = new Date();
		taskinfo.setTask_start_dtate(startdate);
		repositry.save(taskinfo);
		return true;
	}

	@Override
	public boolean removetask(int id) {

		repositry.deleteById(id);
		return true;
	}

	@Override
	public boolean updatetask(TaskInfo taskinfo) {
		Date enddate = new Date();
		taskinfo.setTask_end_dtate(enddate);
		repositry.update(taskinfo.getTask(), taskinfo.getTask_end_dtate(), taskinfo.getId());
		return true;

	}
	


	
	@Override
	public List<TaskInfo> showAllTask() {
		return repositry.findAll();

	}

	

}
