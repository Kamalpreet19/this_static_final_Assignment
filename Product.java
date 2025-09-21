/*Create a Product class to manage shopping cart items with the following features:
Static:
○       A static variable discount shared by all products.
○       A static method updateDiscount() to modify the discount percentage.
This:
○       Use this to initialize productName, price, and quantity in the constructor.
Final:
○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
○       Validate whether an object is an instance of the Product class before processing its details. */

public class Product {
    static double discount = 0.10;
    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    void displayProductDetails() {
        if (this instanceof Product)
            System.out.println("Discount on the product : " + discount + "\nName of the product : " + productName
                    + "\nPrice of the book : " + price + "\nQuantity of the product : " + quantity
                    + "\nId of the product : " + productID);
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;

    }

    public static void main(String args[]) {
        Product p1 = new Product("pen", 10, 02, 11);
        Product p2 = new Product("pencil", 5, 04, 8);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");

    }

}
