import java.util.ArrayList;
import java.util.List;
import java.io.Console;
import java.util.Arrays;

class Event{
  // Console myConsole = System.console();

  public int mNumberOfGuests;
  public String mMusic;
  public String mFoodType;
  public String mDrinkType;
  public String mNumberOfEntertainers;
  public int mTotalCost;

  public Event(int numberOfGuests, String music, String foodType, String drinkType, int numberOfntertainers, int totalCost) {
    mNumberOfGuests = numberOfGuests;
    mMusic = music;
    mFoodType = foodType;
    mDrinkType = drinkType;
    mNumberOfEntertainers = numberOfntertainers;
    mTotalCost = totalCost;
  }

  public boolean eventPackage(int maxBudget){
    return (mTotalCost <= maxBudget);
  }
}
