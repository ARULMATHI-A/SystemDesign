package ToDoList;

import java.util.*;

public class TaskViewmodel {
    
    private int currentId=1;
    List<Task> taskList=new ArrayList<>();

    public void addTask(String title){
        Task task=new Task(currentId++,title);
        taskList.add(task);
        System.out.println("Task added succesfully!");
    }

    public void removeTask(int id){
        taskList.removeIf(task->task.getId()==id);
        System.out.println("Task removed successfully!");
    }

    public List<Task> getAllTask(){
        return taskList;
    }
}
