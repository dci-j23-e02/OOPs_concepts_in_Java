package third;

public class Lion  extends Animal{
  private static final int NUMBER_OF_LEGS = 4;

  public Lion(String w) {
    super(w);
  }


  @Override
  public void sound() {
    System.out.println("roar");
  }

  @Override
  public int getNumberOfLegs() {
    return NUMBER_OF_LEGS;
  }


}
