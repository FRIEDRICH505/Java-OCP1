/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author FRIEDRICH
 */
public class shirt {
    public String description;
    public char colorCode;
    public double price;
    
    public shirt(){
        description = "--description required--";
        colorCode = 'U';
        price = 0.00;
    }
    
    public void display (){
        System.out.println("Shirt description: "+ description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
               
    }
  
}
