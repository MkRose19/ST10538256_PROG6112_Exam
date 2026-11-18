/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreportt;
import java.util.Scanner;
/**
 *
 * @author Student
 */


public class ProductSalesReportt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Single-dimensional array for the three top-performing products
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array to store sales: [3 products][3 months]
        int[][] sales = new int[3][3];

        // 1. Prompt the user to input sales for each product across 3 months
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println(); // Blank line between products to match sample output
        }

        // 2. Calculate total sales, average sales, and most popular product
        int totalSales = 0;
        int totalEntries = 0;
        int highestSingleSale = 0;
        String mostPopularProduct = "";

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
                totalEntries++;

                // Check for the highest single monthly sale (matches sample output: 25)
                if (sales[i][j] > highestSingleSale) {
                    highestSingleSale = sales[i][j];
                    mostPopularProduct = products[i];
                }
            }
        }

        // Calculate average across the 9 monthly entries (153 / 9 = 17)
        int averageSales = totalSales / totalEntries;

        // 3. Display the final report matching the sample screenshot
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("************************************");
        System.out.println("TOTAL PRODUCT SALES: " + totalSales);
        System.out.println("AVERAGE PRODUCT SALES: " + averageSales);
        System.out.println("MOST POPULAR PRODUCT: " + mostPopularProduct + " (" + highestSingleSale + ")");

        scanner.close();
    }
}
