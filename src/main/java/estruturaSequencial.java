
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanio.oliveira
 */
public class estruturaSequencial {
    public static void main(String[] args){
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        
        System.out.printf("Resultado = %.2f mestros%n", x);
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
        
    }
}
