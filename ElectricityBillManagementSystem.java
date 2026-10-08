package PreFinalActivity;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */
public class ElectricityBillManagementSystem {

     static class ElectricityBill {

        public ElectricityBill(String eL1001, String juan_Santos,
                               String residential, int par, int par1) {
        }

        void displayBill() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    static class Product {
        private String productId, productName, category;
        private double price;
        private int quantity;

        public Product(String id, String name, String cat,
                       double price, int qty) {
            productId = id;
            productName = name;
            category = cat;
            this.price = price;
            quantity = qty;
        }

        public double calculateInventoryValue() {
            return price * quantity;
        }

        public String getStockStatus() {
            if (quantity == 0) return "Out of Stock";
            if (quantity <= 10) return "Low Stock";
            if (quantity <= 50) return "Normal Stock";
            return "High Stock";
        }

        public void displayProductInfo() {
            System.out.println("===== PRODUCT INFORMATION =====\n");
            System.out.println("Product ID: " + productId + "\n");
            System.out.println("Product Name: " + productName + "\n");
            System.out.println("Category: " + category + "\n");
            System.out.printf("Price: ₱%.2f%n%n", price);
            System.out.println("Quantity: " + quantity + "\n");
            System.out.printf("Inventory Value: ₱%,.2f%n%n",
                    calculateInventoryValue());
            System.out.println("Stock Status: " + getStockStatus());
        }
    }
}