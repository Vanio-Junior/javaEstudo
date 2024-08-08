/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author vanio.oliveira
 */
public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2*PI * radius;
    }
    public static double volume(double radius){
        return 4*PI*radius*radius*radius/3;
    }
}
