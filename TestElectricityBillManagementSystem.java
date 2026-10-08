/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

import PreFinalActivity.ElectricityBillManagementSystem.Product;

/**
 *
 * @author Computer Lab 3
 */
public class TestElectricityBillManagementSystem {
    public static void main(String[] args) {

        Product product = new Product(
                "P1001",
                "Laptop",
                "Electronics",
                35000.00,
                5
        );

        product.displayProductInfo();

        System.out.println("\n===== TEST RESULTS =====");
        System.out.println("Inventory Value: ₱" +
                product.calculateInventoryValue());
        System.out.println("Stock Status: " +
                product.getStockStatus());
    }
}

