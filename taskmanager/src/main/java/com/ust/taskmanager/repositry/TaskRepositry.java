package com.ust.taskmanager.repositry;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.taskmanager.dto.TaskInfo;



public interface TaskRepositry  extends JpaRepository<TaskInfo, Integer> {

	@Transactional
	@Modifying
	@Query("update TaskInfo set task=:task,task_end_date=:task_end_date where id=:id")
	public void update(@Param("task")String task, @Param("task_end_date")Date task_end_date,
			@Param("id")int id);
	

	
}
