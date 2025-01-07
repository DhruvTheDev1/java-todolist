import org.junit.Assert;
import org.junit.Test;

public class TaskTest {
  @Test // testing constuctor of Task class
  public void testTaskConstructor() {
    Task test = new Task(1, "testName", "testDescription");
    Assert.assertEquals(1, test.getID());
    Assert.assertEquals("testName", test.getTaskName());
    Assert.assertEquals("testDescription", test.getDescription());
  }
}
