/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estruturaFor;

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
        
        int n = sc.nextInt();
        int soma =0;
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
