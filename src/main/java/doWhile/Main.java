/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package doWhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char resposta;

        do{
            System.out.println("Digite a temperatura em Celsius");
            double tempCel = sc.nextDouble();
            double tempFah = ((9*tempCel)/5)+32;
            System.out.printf("%.1f%n", tempFah);
            System.out.println("deseja Reptir? (s/n)");
            resposta = sc.next().charAt(0);
            
        }
        while(resposta != "n".charAt(0));
        
        sc.close();
    }
}
