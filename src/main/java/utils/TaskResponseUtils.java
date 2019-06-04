package utils;

import java.util.List;

import com.bishal.todolist.mapper.TaskResponseMapper;
import com.bishal.todolist.model.Task;

public class TaskResponseUtils {

	
	public static TaskResponseMapper createSuccessResponse() {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage("Successful");
		trm.setStatus(200);
		return trm;
	}
	
	public static  TaskResponseMapper createSuccessResponse(String message) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage(message);
		trm.setStatus(200);
		return trm;
	}
	
	public  static TaskResponseMapper createErrorResponse() {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage("Error");
		trm.setStatus(500);
		return trm;
	}
	
	public  static TaskResponseMapper createSuccessResponse(Task t) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage("Successful");
		trm.setStatus(200);
		trm.setTask(t);
		return trm;
	}
	
	public  static TaskResponseMapper createSuccessResponse(Task t, String message) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage(message);
		trm.setStatus(200);
		trm.setTask(t);
		return trm;
	}
	
	public  static TaskResponseMapper createSuccessResponse(List<Task> t, String message) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage(message);
		trm.setStatus(200);
		trm.setTasks(t);
		return trm;
	}
	
	public  static TaskResponseMapper createSuccessResponse(List<Task> t) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setStatus(200);
		trm.setTasks(t);
		return trm;
	}
	
	public  static TaskResponseMapper createErrorResponse(String message) {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage(message);
		trm.setStatus(500);
		return trm;
	}
	
	public  static TaskResponseMapper createNotFoundResponse() {
		TaskResponseMapper trm = new TaskResponseMapper();
		trm.setMessage("Not Found");
		trm.setStatus(404);
		return trm;
	}
}
