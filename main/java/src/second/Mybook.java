package second;

import first.Book;

public class Mybook  extends Book {

  // Fields
  // private : access modifier, makes the entity ONLY accessible within the declared class
  private int numOfCopies;

 // Constructors


  public Mybook(int numOfCopies, String title, String author, double price) {
    super(title, author, price);
    this.numOfCopies = numOfCopies;
  }

  // Methods, include all getters and setters ...
  public int getNumOfCopies() {
    return numOfCopies;
  }

  public void setNumOfCopies(int numOfCopies) {
    this.numOfCopies = numOfCopies;
  }


  // Calculate total price of my book


  public double calculateBookPrice() {
    return this.numOfCopies * this.price;
  }
}
