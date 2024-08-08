/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author vanio.oliveira
 */
public class Product {
    public String name;
    public double price;
    public int quantity;
    
    public double totalValues(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name 
                +", $"
                +String.format("%.2f", price)
                +", "
                +quantity
                +" Units, Total: $"
                +String.format("%.2f", totalValues());
    }
}
