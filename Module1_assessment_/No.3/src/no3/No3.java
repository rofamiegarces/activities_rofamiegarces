/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

/**
 *
 * @author Administrator
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] example = {98, 70,74,80,74};//example array
     int sum = 0;
     int ave = 0;
                       
    for(int i = 0; i < example.length; i++){
     sum += example[i];
                       }  
     ave = sum/example.length;
     System.out.println("AVERAGE : "+ave);
    }
    
}
