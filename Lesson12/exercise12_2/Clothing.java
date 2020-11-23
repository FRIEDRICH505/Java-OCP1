/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.exercise12_2;

/**
 *
 * @author FRIEDRICH
 */
public class Clothing {
     private int ItemID = 0;
    private String desc = "--description required--";
    private char colorCode = 'U';
    private double price = 0.0;

    public void display() {
        System.out.println("itemID: " + getItemID());
        System.out.println("description: " + getDesc());
        System.out.println("colorCode: " + getColorCode());
        System.out.println("price: " + getPrice());
    }

    public Clothing(int itemID, String desc, char color, double price) {
        this.ItemID = itemID;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;

    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}




