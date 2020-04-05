package com.bishal.todolist.service;

import com.bishal.todolist.mapper.TaskRequestMapper;
import com.bishal.todolist.mapper.TaskResponseMapper;

public interface ITodoListService {

    TaskResponseMapper addUpdateTask(TaskRequestMapper trm);

    TaskResponseMapper deleteTask(String id);

    TaskResponseMapper findAll();

    TaskResponseMapper findByTitle(String title);
}
