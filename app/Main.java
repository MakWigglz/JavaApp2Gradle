package org.example;
public class Main {
    public static void main(String[] args) {
        // Create instances of Store
        Store product1 = new Store("Electronics", 50, 299.99, "Smartphone");
        Store product2 = new Store("Electronics", 30, 499.99, "Laptop");
        Store product3 = new Store("Electronics", 20, 199.99, "Tablet");
        Store product4 = new Store("Home Appliance", 40, 99.99, "Blender");
        Store product5 = new Store("Home Appliance", 25, 149.99, "Microwave");
        Store product6 = new Store("Home Appliance", 15, 399.99, "Refrigerator");
        Store product7 = new Store("Furniture", 10, 799.99, "Sofa");
        Store product8 = new Store("Furniture", 5, 299.99, "Dining Table");
        Store product9 = new Store("Furniture", 8, 199.99, "Chair");
        Store product10 = new Store("Clothing", 100, 29.99, "T-Shirt");
        Store product11 = new Store("Clothing", 80, 49.99, "Jeans");
        Store product12 = new Store("Clothing", 60, 99.99, "Jacket");

        // Print out the details of the products
        System.out.println(product1.getProductName() + " - " + product1.getProductType() + ": " + product1.getInventoryCount() + " units at $" + product1.getInventoryPrice());
        System.out.println(product2.getProductName() + " - " + product2.getProductType() + ": " + product2.getInventoryCount() + " units at $" + product2.getInventoryPrice());
        System.out.println(product3.getProductName() + " - " + product3.getProductType() + ": " + product3.getInventoryCount() + " units at $" + product3.getInventoryPrice());
        System.out.println(product4.getProductName() + " - " + product4.getProductType() + ": " + product4.getInventoryCount() + " units at $" + product4.getInventoryPrice());
        System.out.println(product5.getProductName() + " - " + product5.getProductType() + ": " + product5.getInventoryCount() + " units at $" + product5.getInventoryPrice());
        System.out.println(product6.getProductName() + " - " + product6.getProductType() + ": " + product6.getInventoryCount() + " units at $" + product6.getInventoryPrice());
        System.out.println(product7.getProductName() + " - " + product7.getProductType() + ": " + product7.getInventoryCount() + " units at $" + product7.getInventoryPrice());
        System.out.println(product8.getProductName() + " - " + product8.getProductType() + ": " + product8.getInventoryCount() + " units at $" + product8.getInventoryPrice());
        System.out.println(product9.getProductName() + " - " + product9.getProductType() + ": " + product9.getInventoryCount() + " units at $" + product9.getInventoryPrice());
        System.out.println(product10.getProductName() + " - " + product10.getProductType() + ": " + product10.getInventoryCount() + " units at $" + product10.getInventoryPrice());
        System.out.println(product11.getProductName() + " - " + product11.getProductType() + ": " + product11.getInventoryCount() + " units at $" + product11.getInventoryPrice());
        System.out.println(product12.getProductName() + " - " + product12.getProductType() + ": " + product12.getInventoryCount() + " units at $" + product12.getInventoryPrice());

        // create an instance of Main and call the run method
        Main mainInstance = new Main();
        mainInstance.run();
    }
    public void run() {
        System.out.println("Main is running");
    }
}