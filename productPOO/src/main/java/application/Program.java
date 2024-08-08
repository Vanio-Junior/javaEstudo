/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Eter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price :");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: "+ product);
        
        System.out.println();
        System.out.print("Enter the Number of the products to be aded in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of the products to de removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("Updated data: " + product);        
        
        sc.close();
        
    }
}
