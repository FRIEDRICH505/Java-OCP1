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
public class Shirt extends Lesson12.exercise12_1.Clothing {
    private char fit = 'U';
    private String sleeve;

    public Shirt(int ItemID, String description, char colorCode, double price, char fit, String sleeve) {
        super(ItemID, description, colorCode, price);

        this.fit = fit;
        this.sleeve = sleeve;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("fit: " + getFit());
        System.out.println("Sleeve: " + getSleeve());
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

}



