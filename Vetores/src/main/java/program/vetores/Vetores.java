/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas: ");
        int n = sc.nextInt();
        double sum = 0;
        double[] vect = new double[n];
        for(int i=0; i<n; i++){
            System.out.println("Digite a Altura: ");
            vect[i] = sc.nextDouble();
        }
        
        for(int i=0; i<vect.length; i++){
            sum += vect[i];
        }
        
        System.out.printf("Altura media: %.2f", sum/n);
        sc.close();
    }
}
