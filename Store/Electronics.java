package Store;

public class Electronics extends Product {
    int warranty;
    public  Electronics(String id,String name, double price, int warranty) {
        super(id,name,price);
        this.warranty = warranty;

    }

    @Override
    void displayDetails() {
        System.out.println("Electronics item:");
        super.displayDetails();
        System.out.println("Warranty: "+warranty+" years");
    }
}
