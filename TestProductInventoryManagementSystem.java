package PreFinalActivity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Computer Lab 3
 */
public class TestProductInventoryManagementSystem {

    public static void main(String[] args) {

        ProductInventoryManagementSystem system =
                new ProductInventoryManagementSystem();

        ProductInventoryManagementSystem.Product product =
                system.new Product(
                    "P-1001",
                    "Wireless Mouse",
                    "Computer Accessories",
                    850.00,
                    25
                );

        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println();
        System.out.println("Product ID: P-1001");
        System.out.println();
        System.out.println("Product Name: Wireless Mouse");
        System.out.println();
        System.out.println("Category: Computer Accessories");
        System.out.println();
        System.out.printf("Price: ₱%.2f%n", 850.00);
        System.out.println();
        System.out.println("Quantity: 25");
        System.out.println();
        System.out.printf("Inventory Value: ₱%,.2f%n",
                product.calculateInventoryValue());
        System.out.println();
        System.out.println("Stock Status: " + product.getStockStatus());
    }
}




