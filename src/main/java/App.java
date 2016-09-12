import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("I'm building an event application!");

    Event firstEvent = new Event(50, "CD", "LightSnack", "Water", 0, 1200);
    Event secondEvent = new Event(250, "DJ", "Plated", "Wine", 1, 12050);
    Event thirdEvent = new Event(500, "LifeBand", "Buffet", "Wine", 4, 35200);
    Event fourthEvent = new Event(75, "LifeBand", "ThreeCourse", "FullBar", 3, 9525);
    Event fifthEvent = new Event(200, "DJ", "Buffet", "SoftDrinks", 2, 13100);

    List<Event> allEvents = new ArrayList<Event>();
    allEvents.add(firstEvent);
    allEvents.add(secondEvent);
    allEvents.add(thirdEvent);
    allEvents.add(fourthEvent);
    allEvents.add(fifthEvent);

    while(true){
      System.out.println("Welcome to our one stop EventPlanning Shop. What would you like to do? Enter one of the following options: See package events, Search by budget,  or Custom package");
      String navigationChoice = myConsole.readLine();

      if (navigationChoice.equals("See package events")){
        for ( Event individualEvent : allEvents ) {
         System.out.println( "----------------------" );
         System.out.println( individualEvent.mNumberOfGuests );
         System.out.println( individualEvent.mMusic );
         System.out.println( individualEvent.mFoodType );
         System.out.println( individualEvent.mDrinkType );
         System.out.println( individualEvent.mNumberOfEntertainers );
         System.out.println( individualEvent.mTotalCost );
        }
      } else if (navigationChoice.equals("Search by budget")){
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
      } else if (navigationChoice.equals("Custom package")){
          System.out.println("Alright, let's custom build your event package! How many guests do you plan to invite? ");
          int custEventNumberOfGuest = Integer.parseInt(myConsole.readLine());
          System.out.println("Awesome! What would you like for music? LifeBand, DJ, CD or nothing? ");
          String custEventMusic = myConsole.readLine();
          System.out.println("Great! what food service will you prefered? We have ThreeCourse, Buffet, Plated or lightSnack. ");
          String custEventFood = myConsole.readLine();
          System.out.println("And how about the drinks? We offer the following packages: Full bar, Wine, Soft drinks or Water. ");
          String custEventDrink = myConsole.readLine();
          System.out.println("Cool. How many entertainers would you want to perform? ");
          int custEventEntertainers = Integer.parseInt(myConsole.readLine());

          Int totalCost = new Event.calculateEventCost( custEventNumberOfGuest, custEventMusic, custEventFood, custEventDrink, custEventEntertainers);

          System.out.println("Finally, the total cost for your custom event is " + totalCost + ".");

          Event customEvent = new Event( custEventNumberOfGuest, custEventMusic, custEventFood, custEventDrink, custEventEntertainers);
          allEvents.add(customEvent);
          System.out.println("Alright, here's your customized event:");
          System.out.println( "----------------------" );
          System.out.println( custEventNumberOfGuest.mNumberOfGuests );
          System.out.println( custEventMusic.mMusic );
          System.out.println( custEventFood.mFoodType );
          System.out.println( custEventDrink.mDrinkType );
          System.out.println( custEventEntertainers.mNumberOfEntertainers );
      } else {
          System.out.println("I'm sorry, we don't recognize your input");
      }
    }
  }
}
