package com.bishal.todolist.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishal.todolist.dao.ITodoListDao;
import com.bishal.todolist.mapper.TaskRequestMapper;
import com.bishal.todolist.mapper.TaskResponseMapper;
import com.bishal.todolist.model.Task;
import com.bishal.todolist.service.ITodoListService;

import utils.TaskResponseUtils;

@Service
public class TodoListServiceImpl implements ITodoListService{

	@Autowired
	private ITodoListDao todoListDao;

	@Override
	 public TaskResponseMapper addUpdateTask(TaskRequestMapper trm) {
		 try {
			 Task task = createTaskFromTaskRequestMapper(trm);
			 todoListDao.save(task);
			 return TaskResponseUtils.createSuccessResponse(task);
		 }catch (Exception e) {
			// TODO: handle exception
			 return TaskResponseUtils.createErrorResponse();
		 }
		 
	 }

	@Override
	 public TaskResponseMapper deleteTask(String id) {
		 try {
		 
			 todoListDao.deleteById(id);
			 return TaskResponseUtils.createSuccessResponse();
		  
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }

	@Override
	 public TaskResponseMapper findAll() {
		 try {
		 List<Task> task =  todoListDao.findAll();
		 return TaskResponseUtils.createSuccessResponse(task);
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }

	@Override
	 public TaskResponseMapper findByTitle(String title) {
		 try {
		 List<Task> tasks = todoListDao.findAllByTitle(title);
		 return TaskResponseUtils.createSuccessResponse(tasks);
	 }catch (Exception e) {
		// TODO: handle exception
		 return TaskResponseUtils.createErrorResponse();
	 }
	 }

	private Task createTaskFromTaskRequestMapper(TaskRequestMapper trm) {
		// TODO Auto-generated method stub
		Task task = new Task();
		task.setCreateDate(trm.getCreateDate() == null ? new Date(): trm.getCreateDate());
		task.set_id(trm.get_id());
		task.setDueDate(trm.getDueDate());
		task.setIsDeleted(false);
		task.setLabel(trm.getLabel());
		task.setTaskDetail(trm.getTaskDetail());
		task.setUpdateDate(new Date());
		task.setStatus(trm.getStatus());
		task.setTitle(trm.getTitle());
		return task;
	}
}
