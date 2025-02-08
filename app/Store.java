package org.example;
public class Store {
    private String productType;
    private int inventoryCount;
    private double inventoryPrice;
    private String productName;

    // Constructor to initialize the variables
    public Store(String productType, int inventoryCount, double inventoryPrice, String productName) {
        this.productType = productType;
        this.inventoryCount = inventoryCount;
        this.inventoryPrice = inventoryPrice;
        this.productName = productName;
    }

    // Getter methods
    public String getProductType() {
        return productType;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public double getInventoryPrice() {
        return inventoryPrice;
    }

    public String getProductName() {
        return productName;
    }

    // Setter methods
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setInventoryPrice(double inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Display method to print the details of the product
    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Type: " + productType);
        System.out.println("Inventory Count: " + inventoryCount);
        System.out.println("Inventory Price: $" + inventoryPrice);
    }
}