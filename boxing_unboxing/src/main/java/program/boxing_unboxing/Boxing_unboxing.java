/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.boxing_unboxing;

/**
 *
 * @author vanio.oliveira
 */
public class Boxing_unboxing {

    public static void main(String[] args) {
        int x = 20;
        Object obj = x;
        
        System.out.println(obj);
        
        int y = (int) obj;
        System.out.println(y);
        
        //wrappers classes 
        
        
        int x2 = 20;
        Integer obj2 = x2;
        
        System.out.println(obj2);
        
        int y2 = obj2;
        System.out.println(y2);
    }
}
