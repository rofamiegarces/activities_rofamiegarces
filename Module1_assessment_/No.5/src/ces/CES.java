/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ces;

/**
 *
 * @author Administrator
 */
public class CES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
String text = " the quik brown fox";
        

for(int i = 0; i < text.length(); i++ ) {
if(text.charAt(i) != ' '
&& text.charAt(i) !='q'
&& text.charAt(i) !='u'
&& text.charAt(i) !='e'
&& text.charAt(i) !='e'
&& text.charAt(i) !='n') {
      
    
System.out.println(text.charAt(i));
       }
             
      }
    }
    
    
    
}

