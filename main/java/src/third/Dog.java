package third;

public class Dog extends Animal{
  private static final int NUMBER_OF_LEGS = 4;

  @Override
  public void sound() {
    System.out.println("haw Haw");
  }

  @Override
  public int getNumberOfLegs() {
    return NUMBER_OF_LEGS;
  }
}
