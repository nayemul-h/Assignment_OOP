package Store;

import java.util.ArrayList;
import java.util.Scanner;

public class getDetails {
    static int i=0,j=0,k=0;
    static ArrayList<Product> products = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static int pChoice;
    static Electronics[] e= new Electronics[10];
    static Clothing[] c= new Clothing[10];
    static Book[] b= new Book[10];

    public static void main(String[] args) {


        while (true) {
            System.out.println("Welcome to the Store Management System");
            System.out.println("1. Add Product\n2. Display All Products\n3.Search products by name\n4.Calculate total price\n5.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    addProduct();
                    break;

                    case 2:
                        for (Product p : products) {
                            p.displayDetails();
                        }

                        break;

                        case 3:

                            search();

                           break;
                           case 4:
                               calculateTotal();
                               break;
                               case 5:
                                   return;



            }
        }


    }

    static void calculateTotal(){
        double total=0;
        for (Product p : products) {
            total+=p.price;

        }
        System.out.println("Total price:"+total);
    }

    static void search() {
        System.out.println("Enter product name:");
        String searchName;
        boolean x=false;
        sc.nextLine();
        searchName=sc.nextLine();
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(searchName)) { // direct access
                p.displayDetails();
                x=true;
            }
            if(x==false){
                System.out.println("Product not found");
            }
        }
    }

       static void addProduct() {
        System.out.println("Enter product type\n1.Electronics\n2.Clothing\n3.Book");
        System.out.println("Which product do you want to add?");
        pChoice=sc.nextInt();
        String tId, tName, tAuthor;
        double tPrice;
        int tWarranty;
        String tSize;


        switch (pChoice) {
            case 1:

                System.out.println("Enter product ID: ");
                tId = sc.next();
                sc.nextLine();
                System.out.println("Enter product name: ");
                tName = sc.nextLine();
                System.out.println("Enter product price: ");
                tPrice = sc.nextDouble();
                System.out.println("Enter product warranty: ");
                tWarranty = sc.nextInt();
                e[i]=new Electronics(tId,tName,tPrice,tWarranty);
                products.add(e[i]);
                i++;
                break;
                case 2:

                System.out.println("Enter product ID: ");
                tId = sc.next();
                sc.nextLine();
                System.out.println("Enter product name: ");
                tName = sc.nextLine();
                System.out.println("Enter product price: ");
                tPrice = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter product Size: ");
                tSize = sc.nextLine();
                c[j]=new Clothing(tId,tName,tPrice,tSize);
                products.add(c[j]);
                j++;
                break;

            case 3:
                System.out.println("Enter product ID: ");
                tId = sc.next();
                sc.nextLine();
                System.out.println("Enter product name: ");
                tName = sc.nextLine();
                System.out.println("Enter product price: ");
                tPrice = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter Author name: ");
                tAuthor = sc.nextLine();
                b[k]=new Book(tId,tName,tPrice,tAuthor);
                products.add(b[k]);
                k++;
                break;
            default:
                System.out.println("Wrong choice");

        }
    }




}