
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanio.oliveira
 */
public class entradadeDados2 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s1,s2,s3;
        
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.printf("Dados Digitados: %s, %s, %s", s1, s2, s3);
        
        sc.close();
    }
}


