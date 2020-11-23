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
public class Customer {
    private String name;
    private String ssn;
    private String first_name;
    private String last_name;
    private String email;
    
    public Customer (String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }  
    public Customer (String first_name, String last_name, String ssn, String email){
       this.first_name = first_name;
       this.last_name = last_name;
       this.ssn = ssn;
       this.email = email;
    }
    public String getName(){ 
     return name;   
    }
    public void setName(String n){
        name = n;
    }
    public String getSSN(){
        return ssn;    
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

