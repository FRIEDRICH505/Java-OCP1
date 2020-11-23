/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_2;

/**
 *
 * @author FRIEDRICH
 */
public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;
     
    public Order (String name, double total, String state, char custType){
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
        
    }
    public String getDiscount(){
        return Double.toString(discount) + "%";
        
    }
    public void calcDiscount(){
        if (custType == NONPROFIT){
            if (total > 800){
                discount = 10.00;
            }else discount = 5.00;
        }else if (custType == PRIVATE){
            if (total > 900){
                discount = 7.00;
            }else discount = 0;
        }else if (custType == CORP){
            if (total < 500){
                discount = 0.00;
            }else discount = 5.00;
            } 
        }
    }

