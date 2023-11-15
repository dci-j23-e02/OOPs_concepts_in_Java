package first;

public class Book {


  // Fields : protected : access modifier , make them accessible in the same package and subclasses
  protected String title;
  protected  String author;
  protected  double price;

  // Constructors
  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

 // Methods: getters and setters , toString
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // toString

  @Override
  public String toString() {
    return "first.Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        '}';
  }

  // Other methods ...

}
