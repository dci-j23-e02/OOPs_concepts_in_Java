package third;

public abstract class Animal {

  // Fields
  protected String weight;


  // Constructor
  public  Animal (String w){
    this.weight = w;
  }


  // Abstract methods
  public  abstract  void sound();
  public abstract int getNumberOfLegs();

  // Concrete implemented methods
  public String giveDetails(){
    return "All animals drink water";
  }


}
