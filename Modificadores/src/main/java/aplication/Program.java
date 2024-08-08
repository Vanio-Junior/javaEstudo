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
        
        System.out.println("Eter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price :");
        double price = sc.nextDouble();
        //System.out.print("Quantity in stock: ");
        //int quantity = sc.nextInt();
        Product product = new Product(name,price);
        
        product.setName("computer");
        System.out.println("Updated name: "+ product.getName());
        product.setPrice(200);
        System.out.println("Updated price: "+ product.getPrice());
        
        System.out.println();
        System.out.println("Product data: "+ product);
        
        System.out.println();
        System.out.print("Enter the Number of the products to be aded in stock: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of the products to de removed from stock: ");
        quantidade = sc.nextInt();
        product.removeProduct(quantidade);
        System.out.println("Updated data: " + product);        
        
        sc.close();
        
    }
}
