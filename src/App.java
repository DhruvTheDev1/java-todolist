public class App {
    public static void main(String[] args) throws Exception {

        TaskManager toDoList = new TaskManager();

        toDoList.addTask(new Task(1, "Groceries", "Go Shopping"));
        toDoList.addTask(new Task(2, "Sleep", "Go sleep"));

        toDoList.toDoList();

        toDoList.addTask(new Task(1, "Groceries", "Go Shopping"));

        
    }
}
