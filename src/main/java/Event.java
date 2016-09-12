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

  public int calculateMusicCost(String music) {
    if(music = "LifeBand") {
      int musicCost = 1500;
    }else if(music = "DJ") {
      int musicCost = 500;
    }else if(music = "CD") {
      int musicCost = 200;
    }else {
      int musicCost = 0;
    }
  }

  public int calculateFoodCost(String foodType, int numberOfGuests) {
    if(foodType = "ThreeCourse") {
      int foodCost = numberOfGuests * 75;
    }else if(foodType = "Buffet") {
      int foodCost = numberOfGuests * 50;
    }else if(foodType = "Plated") {
      int foodCost = numberOfGuests * 30;
    }else {
      int foodCost = 15;
    }
  }

  public int calculateDrinkCost(String drinkType, int numberOfGuests) {
    if(drinkType = "Full bar") {
      int drinkCost = numberOfGuests * 20;
    }else if(drinkType = "Wine") {
      int drinkCost = numberOfGuests * 15;
    }else if(drinkType = "SoftDrinks") {
      int drinkCost = numberOfGuests * 10;
    }else {
      int drinkCost = 5;
    }
  }

  public int calculateEntertainerCost(String numberOfntertainers) {
    int entertainerCost = numberOfntertainers * 300;
  }

  public int calculateEventCost(int musicCost, int foodCost, int drinkCost, int entertainerCost) {
    int eventCost = musicCost + foodCost + drinkCost + entertainerCost;
    return(eventCost);
  }

  public boolean eventPackage(int maxBudget){
    return (mTotalCost <= maxBudget);
  }
}
