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
public class Shirt {
    private int shirtID = 0;
    private String description = "-description required-";
    private char colorCode = 'U';
    private double price = 0.0;

    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        if (colorCode == 'R'){
            colorCode = colorCode;
            return;
        }
        if (colorCode == 'G'){
            colorCode = colorCode;
            return;
        }
        if (colorCode == 'B'){
            colorCode = colorCode;
            return;
    }
        System.out.println("Invalid colorCode. Use R, G or B");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}

