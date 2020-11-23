/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author FRIEDRICH
 */
public class exercise7_1 {
    public static void main(String[] args) {
        String name = "David Botha";
        String firstname;
        String lastname;
        int spaceIdx;
        
        spaceIdx = name.indexOf(" ");
        
        firstname = name.substring(0, spaceIdx);
        System.out.println(firstname);
              
        lastname = name.substring(spaceIdx).trim();
        System.out.println(lastname);
        
        
    }
}
