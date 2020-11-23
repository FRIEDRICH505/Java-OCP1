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
public class CalculatorTest {
    public static void main(String[] args) {
        
        int TotalOne = Calculator.sum(2, 3);
        System.out.println("The total is: " + TotalOne);
        
        float TotalTwo = Calculator.sum(15.99F,12.85F);
        System.out.println("The total is: " + TotalTwo);
        
        float TotalThree = Calculator.sum(2,12.85F);
        System.out.println("The total is: " + TotalThree);
        
    }
}
