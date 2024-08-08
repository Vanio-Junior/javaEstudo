/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estrutraCondicional;

import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class estruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        if(hora < 12){
            System.out.println("Bom Dia!");
        }
        if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }
        if(hora>= 18){
            System.out.println("Boa Noite!");
        }
        if(hora >  24){
            System.out.println("Hora Invalida");
        }
               
        sc.close();
        
        
    }
}
