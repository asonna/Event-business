import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("I'm building an event application!");

    Event firstEvent = new Event(50, "CD", "lightSnack", "Water", 0, 0);
    Event secondEvent = new Event(250, "DJ", "Plated", "Wine", 1, 0);
    Event thirdEvent = new Event(500, "LifeBand", "Buffet", "Wine", 4, 0);
    Event fourEvent = new Event(75, "Lifeband", "ThreeCourse", "FullBar", 3, 0);
    Event fifthEvent = new Event(200, "DJ", "Buffet", "SoftDrinks", 2, 0);

    Event[] allEvents = {firstEvent, secondEvent, thirdEvent, fourEvent, fifthEvent};

    System.out.println("What is the maximum budget you have for your event?");
    int userMaxBudget = Integer.parseInt(myConsole.readLine());
    System.out.println("Alright, here's are some packages we have in your price range of " + userMaxBudget + ".");

    for ( Event individualEvent : allEvents ) {
     if (individualEvent.eventPackage(userMaxBudget)){
       System.out.println( "----------------------" );
       System.out.println( individualEvent.mNumberOfGuests );
       System.out.println( individualEvent.mMusic );
       System.out.println( individualEvent.mFoodType );
       System.out.println( individualEvent.mDrinkType );
       System.out.println( individualEvent.mNumberOfEntertainers );
       System.out.println( individualEvent.mTotalCost );
     }
   }
 }
}
