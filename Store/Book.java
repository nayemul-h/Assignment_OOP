package Store;

public class Book extends Product {
    String author;
    public Book(String id, String name, double price , String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    void displayDetails() {
        System.out.println("Book:");
        super.displayDetails();
        System.out.println("Author: "+author);
    }
}
