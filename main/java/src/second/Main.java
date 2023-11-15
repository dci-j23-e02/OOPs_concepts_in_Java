package second;


import first.Book;
import first.Default;

public class Main {

  public static void main(String[] args) {
     //  System.out.println("OOPs concepts in Java With Examples");

    Mybook bookObject1 = new Mybook(10, "java", "Safwan", 100);
    Mybook bookObject2 = new Mybook(2, "python", "Safwan", 75);
    Mybook bookObject3 = new Mybook(5, "javascript", "Safwan", 165);
    Mybook bookObject4 = new Mybook(6, "php", "Safwan", 45);

    // Example for accessing an attribute that has protected access modifier
    Book b2 = new Book("new title", "new author ");
    // b2.price = 10; : cannot access it from this package because it has protected access modifier
    b2.setPrice(10);

    System.out.println(bookObject1.getNumOfCopies());
    System.out.println(bookObject4.calculateBookPrice());

    //Example for accessing an attribute that has default access modifier
    Default newD = new Default();
    // newD.word = "new word"; it is not public
    newD.setWord("new word");

  }
}
