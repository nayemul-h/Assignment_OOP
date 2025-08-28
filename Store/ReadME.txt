An online shopping platform needs a system to manage its products. You are required to create a package named store to keep your classes organized. At the core of the program, design a base class called Product with fields for product ID, name, and price. The store sells different types of items, so you must create subclasses such as Electronics (with warranty period), Clothing (with size), and Book (with author). [Change the package name to myStorePackage1]

The system should use polymorphism so that when displayDetails() is called, each product type shows its own specific details. All the products must be stored inside an ArrayList<Product> for easy management. [ArrayList Reference Variable name should be myProducts]
Next, write a menu-based program that allows the user to:
1.
Add a new product (with a choice for Electronics, Clothing, or Book).
2.
Display all products in the store.
3.
Search for a product by name.
4.
Calculate the total price of all products currently in the store.
5.
Exit the program.