import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void calculateEventCost_returnsTotalForAllItems() {
    Event testEvent = new Event();
    int expected = 1200;
    assertEquals(expected, testEvent.calculateEvenCost(firstEvent));
  }

  @Test1
  public void calculateEventCost_returnsTotalForAllItems() {
    Event testEvent = new Event(135, "CD", "Buffet", "FullBar", 9950);
    int expected = 9950;
    assertEquals(expected, testEvent.calculateTotalCost());
  }

  // @Test
  // public void calculateEventCost_returnsTotalForAllItems() {
  //   Event testEvent = new Event();
  //   String[] itemCost = {30, 40, 100, 500, 300}
  //   int expected = 970;
  //   assertEquals(expected, testEvent.calculateTotalCost(itemCost));
  // }

  // @Test
  // public void calculateEventCost_returnsTotalForAllItems() {
  //   Event testEvent = new Event();
  //   String[] itemCost = {30, 40, 100, 500, 300}
  //   int expected = 970;
  //   assertEquals(expected, testEvent.calculateTotalCost(itemCost));
  // }

}
