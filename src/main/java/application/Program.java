/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package application;

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
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Enter the measures of traingle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter themeasures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
        
        p = (yA+ yB + yC) / 2;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));
        
        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
