import java.util.Scanner;

public class UserInterface {
  private TaskManager taskManager;
  private Scanner scanner;

  public UserInterface(TaskManager taskManager, Scanner scanner) {
    this.taskManager = taskManager;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.println("To Do List Application");
      System.out.println("1. Add Task");
      System.out.println("2. Update Task");
      System.out.println("3. Delete Task");
      System.out.println("4. List Tasks");
      System.out.println("5. Quit Application");
      System.out.println(); 

      System.out.print("Enter your choice: ");
      int input = scanner.nextInt(); // user command
      scanner.nextLine(); 

      System.out.println();  

      if (input == 5) { // exit application
        System.out.println("Exiting Application");
        System.out.println("Goodbye");
        break;
      }
      processCommand(input); // process user command
    }
  }
  // method for processing user input
  public void processCommand(int command) {
    if (command == 1) {
      addTask();
    } else if (command == 2) {
      updateTask();
    } else if (command == 3) {
      deleteTask();
    } else if (command == 4) {
      taskManager.toDoList(); // prints all tasks
      // can have method to print task by ID - printTask()
    } else {
      System.out.println("Please enter a valid input");
    }
    System.out.println(); 
  }

  public void addTask() {
    System.out.println("Adding a task:");
    System.out.println("Enter Task ID");
    int taskID = scanner.nextInt();
    scanner.nextLine();  

    System.out.println("Enter Task Name");
    String taskName = scanner.nextLine();

    System.out.println("Enter Task Description");
    String taskDescription = scanner.nextLine();

    taskManager.addTask(new Task(taskID, taskName, taskDescription));
    System.out.println("Task Added Successfully!"); 
  }

  public void updateTask() {
    System.out.println("Updating A Task:");
    System.out.println("Please enter task ID");
    int taskID = scanner.nextInt();
    scanner.nextLine();  

    System.out.println("Enter New Task Name");
    String newName = scanner.nextLine();

    System.out.println("Enter New Task Description");
    String newDescription = scanner.nextLine();

    taskManager.updateTask(taskID, newName, newDescription);
    System.out.println("Task Updated Successfully!"); 
  }

  public void deleteTask() {
    System.out.println("Delete Specific Task or All Tasks?");
    System.out.println("1. Specific Task");
    System.out.println("2. All tasks");

    int input = scanner.nextInt();
    scanner.nextLine();  

    if (input == 1) { // delete specific task
      System.out.println("Enter Task ID");
      int deleteTaskID = scanner.nextInt();
      scanner.nextLine();  
      taskManager.deleteTask(deleteTaskID);

    } else if (input == 2) { // clear list
      taskManager.clearTasks();
    } else {
      System.out.println("Invalid choice");
    }
  }
}
