/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesidowu.vuturetaskone;

/**
 *
 * @author jamesidowu
 */
public class PalidromeCheck implements IChecker {

   
    private String palidromeString;
    
    public PalidromeCheck(String str){
        this.palidromeString = str;
    }
    
    public String getPalidromeString() {
        return palidromeString;
    }

    public void setPalidromeString(String palidromeString) {
        this.palidromeString = palidromeString;
    }
    
    

    @Override
    public boolean check() {
         String tempString = "" ;
         String reverseString = "";
         tempString = this.palidromeString.replaceAll("\\s+","").replaceAll("'", "");
       
       
         for (int i = tempString.length() - 1; i >= 0; i--){
           reverseString += tempString.charAt(i);
         }
         
         return(tempString.equalsIgnoreCase(reverseString));
        
    }
}