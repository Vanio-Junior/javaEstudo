/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Program;

import static java.lang.Math.PI;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

/**
 *
 * @author vanio.oliveira
 */
public class MembrosEstaticos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi Values: %.2f%n", PI);
    }
}
