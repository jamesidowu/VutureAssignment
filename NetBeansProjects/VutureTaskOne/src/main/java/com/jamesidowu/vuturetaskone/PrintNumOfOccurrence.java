/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesidowu.vuturetaskone;

import java.util.Map;

/**
 *
 * @author jamesidowu
 */
public class PrintNumOfOccurrence {
    
    
    public static String printCensoredNumOccurrences(Map<String, Integer> map){
        int total = 0;
        String output = "";
         for (Map.Entry<String,Integer> entry : map.entrySet())  {
             total+= entry.getValue();
            output += entry.getKey() + ": " + entry.getValue()+ ", "; 
            
         }
         
        return output += "total: " + total;
    }
   
    
    
    
}
