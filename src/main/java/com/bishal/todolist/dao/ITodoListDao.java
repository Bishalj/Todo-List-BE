package com.bishal.todolist.dao;

import java.util.List;
import java.util.Optional;

import javax.swing.border.TitledBorder;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bishal.todolist.model.Task;

public interface ITodoListDao extends MongoRepository<Task,String> {

	Optional<Task> findById(String _id);
	
	List<Task> findAllByTitle(String title);
	
}
