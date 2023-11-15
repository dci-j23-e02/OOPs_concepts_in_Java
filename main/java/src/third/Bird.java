package third;

public class Bird extends Animal{
  private static final int NUMBER_OF_LEGS = 2;

  @Override
  public void sound() {
    System.out.println("Coco");
  }

  @Override
  public int getNumberOfLegs() {
    return NUMBER_OF_LEGS;
  }
}
