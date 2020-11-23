/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Example2;

/**
 *
 * @author FRIEDRICH
 */
public class ShirtTest {
    public static void main(String[] args) {
        Shirt theShirt = new Shirt();
        char colorCode;
        
        theShirt.setColorCode('R');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
        
        theShirt.setColorCode('Z');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
    }
 
}
