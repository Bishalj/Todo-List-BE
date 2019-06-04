package com.bishal.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishal.todolist.mapper.TaskRequestMapper;
import com.bishal.todolist.mapper.TaskResponseMapper;
import com.bishal.todolist.service.impl.TodoListSearviceImpl;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/todolist")
public class TodoListController {
	
	@Autowired
	TodoListSearviceImpl todoListService;

	@PostMapping("/addUpdate")
	public ResponseEntity<TaskResponseMapper> addUpdateTask(@RequestBody TaskRequestMapper taskRequestMapper){
		TaskResponseMapper t = todoListService.addUpdateTask(taskRequestMapper);
		return new ResponseEntity<TaskResponseMapper>(t, HttpStatus.resolve(t.getStatus()));
		
	}
	
	@GetMapping("/find/{title}")
	public ResponseEntity<TaskResponseMapper> getTaskByTitle(@PathVariable String title){
		TaskResponseMapper t = todoListService.findByTitle(title);
		return new ResponseEntity<TaskResponseMapper>(t, HttpStatus.resolve(t.getStatus()));
		
	}
	
	@GetMapping("/find")
	public ResponseEntity<TaskResponseMapper> getAllTask(){
		TaskResponseMapper t = todoListService.findAll();
		return new ResponseEntity<TaskResponseMapper>(t, HttpStatus.resolve(t.getStatus()));
		
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<TaskResponseMapper> deleteTask(@PathVariable String id){
		TaskResponseMapper t = todoListService.deleteTask(id);
		return new ResponseEntity<TaskResponseMapper>(t, HttpStatus.resolve(t.getStatus()));
		
	}
}
