package Store;

public class Product {
    String id;
    String name;
    double price;

    Product(String id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Product ID: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
    }

    void addProduct(){

    }




}
