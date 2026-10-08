package PreFinalActivity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */
public class ProductInventoryManagementSystem {
    class Product {
    private String id, name, category;
    private double price;
    private int quantity;

    Product(String id, String name, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateInventoryValue() {
        return price * quantity;
    }

    String getStockStatus() {
        if (quantity == 0) return "Out of Stock";
        if (quantity <= 10) return "Low Stock";
        if (quantity <= 50) return "Normal Stock";
        return "High Stock";
    }

    void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₱" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Value: ₱" + calculateInventoryValue());
        System.out.println("Status: " + getStockStatus());
    }
    }

}
