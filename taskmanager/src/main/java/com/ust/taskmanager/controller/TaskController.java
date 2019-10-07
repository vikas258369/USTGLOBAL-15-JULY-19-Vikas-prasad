package com.ust.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.taskmanager.dto.TaskInfo;
import com.ust.taskmanager.dto.TaskInfoResponse;
import com.ust.taskmanager.service.TaskService;





@RestController
@RequestMapping("/taskdetail")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class TaskController {
	
	@Autowired
	@Qualifier("jpa")
	private TaskService service;
	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskInfoResponse getAllTask() {
		List<TaskInfo> taskList = service.showAllTask();
		TaskInfoResponse response = new TaskInfoResponse();
		if (taskList.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task Not Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task Found");
			response.setTaskList(taskList);
		}
		return response;
	}
	
	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskInfoResponse addTask(@RequestBody TaskInfo taskinfo) {
		TaskInfoResponse response = new TaskInfoResponse();
		if (service.addtask(taskinfo)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task add Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task not add Unsuccessfully");
		}
		return response;
	}
	
	
	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskInfoResponse modifyTask(@RequestBody TaskInfo taskinfo) {
		TaskInfoResponse response = new TaskInfoResponse();
		if (service.updatetask(taskinfo)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task modified Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task modified Unsuccessfully");
		}
		return response;
	}
	
	
	
	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskInfoResponse removeTask(@PathVariable("id")int id) {
		TaskInfoResponse response = new TaskInfoResponse();
		if (service.removetask(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task Removed Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task Removed Unsuccessfully");
		}
		return response;

	}
	
}
	


