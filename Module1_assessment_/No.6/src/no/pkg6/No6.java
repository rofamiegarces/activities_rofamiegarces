/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.pkg6;

import java.io.File;

/**
 *
 * @author Admin
 */
public class No6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      File my_file;
        my_file = new File("C:\\Users\\Admin\\");
      
     
      if (my_file.exists()){
          System.out.println("The directory of files exists.\n");
      }else{
          System.out.println("The directory or file does not exist.\n");
      }
    }
    
}
