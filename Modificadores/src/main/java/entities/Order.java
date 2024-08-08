/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Date;

/**
 *
 * @author vanio.oliveira
 */
public class Order {
    private Date date;
    private Product product;

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name2 = "TV";
    }
}
