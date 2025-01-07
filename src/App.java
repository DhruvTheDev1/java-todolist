import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    TaskManager taskManager = new TaskManager();
    Scanner scanner =  new Scanner(System.in);
    UserInterface userInterface = new UserInterface(taskManager, scanner);

    userInterface.start();

    scanner.close();

        
    }
}
