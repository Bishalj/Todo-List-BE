package com.bishal.todolist.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishal.todolist.dao.ITodoListDao;
import com.bishal.todolist.mapper.TaskRequestMapper;
import com.bishal.todolist.mapper.TaskResponseMapper;
import com.bishal.todolist.model.Task;
import com.bishal.todolist.service.ITodoListService;

import utils.TaskResponseUtils;

@Service
public class TodoListSearviceImpl implements ITodoListService{

	@Autowired
	ITodoListDao todoListDao;
	
	 public TaskResponseMapper addUpdateTask(TaskRequestMapper trm) {
		 try {
			 Task t = createTaskFromTaskRequestMapper(trm);
			 todoListDao.save(t);
			 return TaskResponseUtils.createSuccessResponse(t);
		 }catch (Exception e) {
			// TODO: handle exception
			 return TaskResponseUtils.createErrorResponse();
		 }
		 
	 }
	 
	 public TaskResponseMapper deleteTask(String id) {
		 try {
		 
			 todoListDao.deleteById(id);
			 return TaskResponseUtils.createSuccessResponse();
		  
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }
	 
	 public TaskResponseMapper findAll() {
		 try {
		 List<Task> t =  todoListDao.findAll();
		 return TaskResponseUtils.createSuccessResponse(t);
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }
	 
	 public TaskResponseMapper findByTitle(String title) {
		 try {
		 List<Task> t = todoListDao.findAllByTitle(title);
		 return TaskResponseUtils.createSuccessResponse(t);
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }
	 
//	 public Task updateTask(TaskRequestMapper trm) {
//		 Task t = createTaskFromTaskRequestMapper(trm);
//		return todoListDao.save(t);
//		 
//	 }

	private Task createTaskFromTaskRequestMapper(TaskRequestMapper trm) {
		// TODO Auto-generated method stub
		Task t = new Task();
		t.setCreateDate(trm.getCreateDate() == null ? new Date(): trm.getCreateDate());
		t.set_id(trm.get_id());
		t.setDueDate(trm.getDueDate());
		t.setIsDeleted(false);
		t.setLabel(trm.getLabel());
		t.setTaskDetail(trm.getTaskDetail());
		t.setUpdateDate(new Date());
		t.setStatus(trm.getStatus());
		t.setTitle(trm.getTitle());
		return t;
	}
}
