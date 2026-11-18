/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreportt;

/**
 *
 * @author Student
 */
public class PrintProduct {
    

    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        // Cast to int if whole-number display (17) is desired, or print as double (17.0)
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void printFullReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("************************************");
        printTotalProductSales();
        printAverageProductSales();
        printMostPopularProduct();
    }

}
