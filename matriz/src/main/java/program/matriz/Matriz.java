/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.matriz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Matriz {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a ordem da matriz? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int nNegativos = 0;

        
        for(int i=0; i<n; i++){
            for(int l=0; l<n; l++){
                System.out.printf("Digite o %da da Linha %da da matriz:", l+1, i+1);
                int valor = sc.nextInt();
                if(valor<0){
                    nNegativos++;
                }
                matriz[i][l] = valor;
            }
        }
        
        System.out.printf("Main Diagonal: ");
        for(int i=0; i<matriz.length;i++){
            System.out.printf("%d ", matriz[i][i]);
        }
        
        System.out.printf("%n Negative numebers: %d", nNegativos);
        
    }
}
