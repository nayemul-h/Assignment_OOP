package Store;

public class Clothing extends Product {
    String size;
    public Clothing(String id,String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    void displayDetails() {
        System.out.println("Clothing Item:");
        super.displayDetails();
        System.out.println("Size: "+size);
    }
}
