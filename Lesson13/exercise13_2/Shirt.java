/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.exercise13_2;

/**
 *
 * @author FRIEDRICH
 */
public class Shirt extends Item {

    private char size;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price, colorCode);
        this.setSize(size);
    }

    public void display() {
        super.display();
        System.out.println("\tSize: " + getSize());
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
