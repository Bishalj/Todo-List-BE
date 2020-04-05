package utils;

import java.util.List;

import com.bishal.todolist.mapper.TaskResponseMapper;
import com.bishal.todolist.model.Task;

public class TaskResponseUtils {

	
	public static TaskResponseMapper createSuccessResponse() {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage("Successful");
		taskResponseMapper.setStatus(200);
		return taskResponseMapper;
	}
	
	public static  TaskResponseMapper createSuccessResponse(String message) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage(message);
		taskResponseMapper.setStatus(200);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createErrorResponse() {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage("Error");
		taskResponseMapper.setStatus(500);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createSuccessResponse(Task t) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage("Successful");
		taskResponseMapper.setStatus(200);
		taskResponseMapper.setTask(t);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createSuccessResponse(Task t, String message) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage(message);
		taskResponseMapper.setStatus(200);
		taskResponseMapper.setTask(t);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createSuccessResponse(List<Task> t, String message) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage(message);
		taskResponseMapper.setStatus(200);
		taskResponseMapper.setTasks(t);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createSuccessResponse(List<Task> t) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setStatus(200);
		taskResponseMapper.setTasks(t);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createErrorResponse(String message) {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage(message);
		taskResponseMapper.setStatus(500);
		return taskResponseMapper;
	}
	
	public  static TaskResponseMapper createNotFoundResponse() {
		TaskResponseMapper taskResponseMapper = new TaskResponseMapper();
		taskResponseMapper.setMessage("Not Found");
		taskResponseMapper.setStatus(404);
		return taskResponseMapper;
	}
}
