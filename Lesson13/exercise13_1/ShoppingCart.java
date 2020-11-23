/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.exercise13_1;

/**
 *
 * @author FRIEDRICH
 */
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        for (String s : dayList) {
            if (s.equals("sunday")) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s);
            }
        }
        System.out.println(dayList);
    }
}
