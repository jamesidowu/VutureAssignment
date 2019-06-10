/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesidowu.vuturetaskone;

import java.util.Arrays;

/**
 *
 * @author jamesidowu
 */
public class PalidromeCensor implements ICensor {
    
    private String text;
    
    public PalidromeCensor(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String censorString() {
        String tempString = "";
        String reverseString = "";
        
        String arrayWords[] = text.split(" ");
         
         for (int i = 0; i < arrayWords.length; i++){
             tempString = arrayWords[i].trim();
             
            for (int o = tempString.length()-1; o >=0 ; o--){
            reverseString += tempString.charAt(o);
            
            if (tempString.equalsIgnoreCase(reverseString)){
                tempString = tempString.replaceAll("\\B\\w\\B", "*");
                tempString = tempString.replace('*', '$');
           }
            arrayWords[i] = tempString;
            }
         }
         
         return mytoString(arrayWords);
        
    }
    
      private static String mytoString(String[] theArray) {
        String theString = Arrays.toString(theArray);
        return theString.replaceAll(",", "").replace("[", "").replace("]", "");
        }
}
