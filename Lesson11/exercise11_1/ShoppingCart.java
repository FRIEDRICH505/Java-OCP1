/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.exercise11_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author FRIEDRICH
 */
public class ShoppingCart {
    public static void main(String[] args) {
        LocalDateTime orderDate;
      
        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);
        
        String fdate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date:" + fdate);
    }
}
