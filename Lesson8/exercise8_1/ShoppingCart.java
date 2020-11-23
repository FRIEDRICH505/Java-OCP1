/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.exercise8_1;

/**
 *
 * @author FRIEDRICH
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        
        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else
            System.out.println("Invalid color");
        
        }
    }

