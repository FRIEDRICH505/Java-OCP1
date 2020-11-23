/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author FRIEDRICH
 */
public class exercise5_1 {
    public static void main(String[] args) {
        int quantity = 1;
        double price = 5.60;
        double total;
        boolean outOfStock;
        
        if (quantity > 1){
            
            outOfStock = true;
            System.out.println("This item is out of stock");
        }    
         else {
            outOfStock = false;
           total = quantity * price;
        
        System.out.println("Total cost is: "+total);
                 }
         
         
        }
        
        
    }

