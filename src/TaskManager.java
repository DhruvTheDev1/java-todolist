import java.util.ArrayList;
import java.util.List;

public class TaskManager {
  private List<Task> tasks; // array list Tasks
  // id, taskName, description

  public TaskManager() {
    tasks = new ArrayList<>();
  }

  public void addTask(Task task) { // add task to arraylist
    if (taskExists(task.getID())) {
      System.out.println("Task " + task.getID() + " Exists!");
    } else {
      tasks.add(task); // id, taskName, description
    }
  }

  public boolean taskExists(int id) { // ensuring no task with same ID is created
    for (Task task : tasks) {
      if (task.getID() == id) {
        return true;
      }
    }
    return false;
  }

  public void toDoList() { // print all tasks
    for (Task task : tasks) {
      System.out.println(task);
    }
  }

  public void printTask(int id) { // print task by id
    boolean found = false;
    for (Task task : tasks) {
      if (task.getID() == id) {
        System.out.println(task);
        found = true; // if found boolean flag = true
        break;
      }
    }
    if (!found) {
      System.out.println("Task Not Found"); // else print not found
    }
  }

  public void deleteTask(int id) { // delete specific task
    boolean removed = tasks.removeIf(task -> task.getID() == id);
    if (removed) {
      System.out.println("Task " + id + " Deleted Successfully");
    } else {
      System.out.println("Task " + id + " Not Found");
    }
  }

  public void clearTasks() { // delete all tasks
    tasks.clear();
    System.out.println("To Do List Cleared!");
  }

  public void updateTask(int id, String newName, String newDescription) {
    for (Task task : tasks) {
      if (task.getID() == id) {
        task.setName(newName);
        task.setDescription(newDescription);
        System.out.println("Task Updated");
        return;
      }
    }
    System.out.println("Task Not Found!");
  }
}
