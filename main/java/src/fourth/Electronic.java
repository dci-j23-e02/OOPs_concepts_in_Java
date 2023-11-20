package fourth;

public interface Electronic {
// Constant variable
   final String LED = "LED";

// Abstract method ( regular methods )
  int getElectricityUse();

// Static method
  static boolean isEnergyEfficient(String electronicType) {
    if(electronicType.equals(LED)){
      return true;
    }
    return false;
  }

// Default method
  default void printDescription() {
    // default method implementation
    System.out.println("Electronic description ...");
  }
}
