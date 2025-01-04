public class Task {
  private String id;
  private String taskName;
  private String description;

  public Task(String id, String taskName, String description) {
    this.id = id;
    this.taskName = taskName;
    this.description = description;
  }

  public String getID() {
    return this.id;
  }

  public String getTaskName() {
    return this.taskName;
  }

  public String getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return "ID: " + this.id + "\n" +
        "To-Do: " + this.taskName + "\n" +
        "Description: " + this.description;
  }

}
