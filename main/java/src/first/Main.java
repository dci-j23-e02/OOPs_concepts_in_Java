package first;

public class Main {

  public static void main(String[] args) {
    Book b1 = new Book("title", "author");
    b1.price = 10;

    Default d = new Default();
    d.word = "anything";
    System.out.println(d.word);
  }


}
