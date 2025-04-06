package ToDoList;
import java.util.*;

public class Main {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    TaskViewmodel viewmodel=new TaskViewmodel();
    
    while(true){
        System.out.println("Enter your Choice");
        System.out.println("1.Add Task\n 2.Remove Task\n 3.Display all Tasks\n 4.Exit ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the Title\n");
                String title=sc.next();
                viewmodel.addTask(title);
                break;
            case 2:
                System.out.println("Enter the Id to be removed\n");
                int id=sc.nextInt();
                viewmodel.removeTask(id);
                break;
            case 3:
                System.out.println("The task are");
                for(Task task:viewmodel.getAllTask()){
                    System.out.println(task.getId()+"."+task.getTitle()+"\n");
                }
                break;
            case 4:
                System.exit(0);
            }
        }
    }
}