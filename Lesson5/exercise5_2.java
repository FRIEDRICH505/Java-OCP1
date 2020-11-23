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
public class exercise5_2 {
    public static void main(String[] args) {
        String[] names = new String [4];
        names [0] = "David";
        names [1] = "Mary";
        names [2] = "Alex";
        names [3] = "Kim";
                
        int[] values = new int [4]; 
        values [0] = 14;
        values [1] = 5;
        values [2] = 12;
        values [3]= 22;
        
        String message = names+" wants to purchase "+values;
        
                
        message = names[3]+" wants to purchase "+ values[3];
        
        System.out.println(message);
                 
           }
}
