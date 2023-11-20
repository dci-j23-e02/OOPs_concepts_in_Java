package fourth;

public class Car implements Fly, Transform{

  @Override
  public void fly() {
    System.out.println("I can fly !!!");
  }

  @Override
  public void transform() {
    System.out.println("I can Transform !!");
  }
}
