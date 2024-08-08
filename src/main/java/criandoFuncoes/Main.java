/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package criandoFuncoes;

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
        
        System.out.println("Digite tre valores:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a,b,c);
        showResult(higher);
        
        sc.close();
    }
    public static int max(int x, int y, int z){
        int aux = z;
        if(x>y && x>z){
            aux = x;
        }
        if(y>z){
            aux = y;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
