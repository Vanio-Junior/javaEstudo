
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanio.oliveira
 */
public class entradaDeDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String x;
        int y;
        double z;
        
        x = sc.next();
        y = sc.nextInt();
        z= sc.nextDouble();
        System.out.printf("Dados digitados %s, %d, %.2f", x,y,z);
        sc.close();
        
    }
}
