/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estruturaRepetitiva;

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
        int soma, x;
        soma = 0;
        x = sc.nextInt();
        
        while(x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }
        
        System.out.println("A Soma dos Valores é de: " + soma);
        
        sc.close();
    }
}
