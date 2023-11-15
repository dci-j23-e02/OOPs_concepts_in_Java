package third;

public abstract class Animal {


  // Abstract methods
  public  abstract  void sound();
  public abstract int getNumberOfLegs();

  // Concrete implemented methods
  public String giveDetails(){
    return "All animals drink water";
  }


}
