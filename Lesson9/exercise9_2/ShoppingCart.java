/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.exercise9_2;

/**
 *
 * @author FRIEDRICH
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");
        Customer cust2 = new Customer("Roger", "Randall","555-44-3212","rog@webmail.com");
        
        //System.out.println("Customer name:" + cust1.getName());
        //System.out.println("Customer SSN:" + cust1.getSSN());
        System.out.println("Customer first name:" + cust2.getFirst_name());
        System.out.println("Customer last name:" + cust2.getLast_name());
        System.out.println("Customer SSN:" + cust2.getSSN());
        System.out.println("Customer email:" + cust2.getEmail());
    }
}