/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4;

/**
 *
 * @author Administrator
 */
public class No4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
  String NAME = "Rofamie Garces";
  String CONTAINS = "es"; 
                       
  String getLast = NAME.substring(NAME.length() - 2, NAME.length());
  System.out.println("the name is :"+NAME);
  System.out.println(" containing of: "+CONTAINS+" last:" +(getLast.equals(CONTAINS) ));
                         
    }   
    }