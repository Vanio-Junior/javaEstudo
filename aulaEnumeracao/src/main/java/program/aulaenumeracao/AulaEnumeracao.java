/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.aulaenumeracao;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

/**
 *
 * @author vanio.oliveira
 */
public class AulaEnumeracao {

    public static void main(String[] args) {
        Order order = new Order (1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
        
    }
}
