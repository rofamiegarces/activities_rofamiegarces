/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.pkg7;

import java.io.File;

/**
 *
 * @author Admin
 */
public class No7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String My_file = "C:\\Users\\Admin\\";
        
        File file = new File(My_file);
        String[] files;
        files = file.list();
        
        for (String file1 : files) {
            System.out.println(file1);
        }
        
    }
    
}
