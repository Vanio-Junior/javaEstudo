/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.vetores2;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Vetores2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos Produtos: ");
        int n = sc.nextInt();
        double sum=0, media=0;
        Product[] vect = new Product[n];
        
        for(int i=0;i<n;i++){
            sc.nextLine();            
            System.out.println("Digite o Nome do Produto: ");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        
        for(int i=0;i<n;i++){
            sum += vect[i].getPrice();
        }
        media = sum/n;
        
        System.out.printf("Preço medio = %.2f",media);
        
        sc.close();
    }
}
