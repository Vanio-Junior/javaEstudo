/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package funcoesString;

/**
 *
 * @author vanio.oliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       String original = "abcde FGHIJ ABC abc DEFG    ";
       
       String s01 = original.toLowerCase();
       String s02 = original.toUpperCase();
       String s03 = original.trim();
       String s04 = original.substring(2);
       String s05 = original.substring(2, 9);
       String s06 = original.replace('a', 'x');
       String s07 = original.replace("abc", "xy");
       int i = original.indexOf("bc");
       int j = original.lastIndexOf("bc");
       
       System.out.println("Original: -"+original+"-");
       System.out.println("Original: -"+s01+"-");
       System.out.println("Original: -"+s02+"-");
       System.out.println("Original: -"+s03+"-");
       System.out.println("Original: -"+s04+"-");
       System.out.println("Original: -"+s05+"-");
       System.out.println("Original: -"+s06+"-");
       System.out.println("Original: -"+s07+"-");
       System.out.println("Original: -"+i+"-");
       System.out.println("Original: -"+j+"-");
    }
}
