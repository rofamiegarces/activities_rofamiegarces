/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

/**
 *
 * @author Administrator
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  String[][] stringArray = new String[5][5];
        for (String[] stringArray1 : stringArray) {
            for (int f = 0; f < stringArray[1].length; f++) {
                stringArray1[f] = "0  ";
            }
        }
        for (String[] stringArray1 : stringArray) {
      for (String stringArray5 : stringArray1) {
          System.out.print(stringArray5);
      }
         System.out.println("\t");   
        }
    }
}
          

