/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_1;

/**
 *
 * @author Administrator
 */
public class No_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] array1 = new int [4];
     int [] array2 = new int [10];
                        
     array1[0] = 4;
     array1[1] = 6;
     array1[1] = 8;
     array2[0] = 8;
     array2[1] = 8;
     array2[1] = 8;
                             
       arraycopy(array1, 1, array2, 2,3);
      
    for (int i =0; i < array2.length; i++){
     System.out.println("Array "+i+" : " + array2[i]);
          }
                             
                             
        }
     public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count){
    for (int i = 0; i < count; i++){
    to[tostart + i] = from[fromstart + i];
                                    }
                             }
    
    }
    

 
