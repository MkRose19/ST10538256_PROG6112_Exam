/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreportt;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    // Constructor to accept the single and 2D arrays
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestSale = 0;
        String mostPopular = "";

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highestSale) {
                    highestSale = sales[i][j];
                    mostPopular = products[i] + " (" + highestSale + ")";
                }
            }
        }
        return mostPopular;
    }
}