public class Task {
  private int id;
  private String taskName;
  private String description;

  public Task(int id, String taskName, String description) {
    this.id = id;
    this.taskName = taskName;
    this.description = description;
  }

  public int getID() {
    return this.id;
  }

  public String getTaskName() {
    return this.taskName;
  }

  public String getDescription() {
    return this.description;
  }

  public void setName(String taskName) {
    this.taskName = taskName; // update taskName
  }

  public void setDescription(String description) {
    this.description = description; // update description
  }

  @Override
  public String toString() {
    return "ID: " + this.id + "\n" +
        "To-Do: " + this.taskName + "\n" +
        "Description: " + this.description + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    // if variables in same place -> equal
    if (this == obj) {
      return true;
    }
    // obj is not of type Task
    if (!(obj instanceof Task)) {
      return false;
    }
    Task comparedObj = (Task) obj;

    // compare instance variable
    if (this.id == comparedObj.id && this.taskName.equals(comparedObj.taskName)
        && this.description.equals(comparedObj.description)) {
      return true;
    }
    return false; // not the same object
  }

}
