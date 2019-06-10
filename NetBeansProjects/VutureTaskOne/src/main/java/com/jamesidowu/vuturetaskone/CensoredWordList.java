/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesidowu.vuturetaskone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jamesidowu
 */
public class CensoredWordList implements IOccurrences, ICensor{
    
    private ArrayList<String> words;
    private String text;
    
    
    public CensoredWordList(ArrayList<String> words, String text){
        this.words = words;
        this.text = text;
    }

    public ArrayList<String> getWordsToCensor() {
        return words;
    }

    public void setWordToCensor(ArrayList<String> words) {
        this.words = words;
    }
    
    
// Task 3a)
    
    @Override
    public Map<String, Integer> countOccurrences() {
        
        Map<String, Integer> resultMap = new HashMap<>();
        
        String arrayWords[] = text.split(" ");
        int count = 0;
        
        for (String s: words){
            s = s.trim();
            count = 0;
            for (String textWord : arrayWords){
//                if (s.equals(textWord)){
//                    count++;
//                }  
             
                  if  (textWord.contains(s)){
                      count++;
                  }
                
                
            }
            
            resultMap.put(s, count);
        }
        
        return resultMap;
    }
    
    // Task 3b)

    @Override
    public String censorString() {
        String arrayWords[] = text.split(" ");
        
        for (String s : this.words){
            System.out.println(s);
            
            for (int i = 0; i < arrayWords.length; i++){
                
            
                if (arrayWords[i].toLowerCase().contains(s)){
                    
                    arrayWords[i] = arrayWords[i].replaceAll("\\B\\w\\B", "*");
                    arrayWords[i] = arrayWords[i].replace('*', '$');
                } 
            }
        }
        
        return mytoString(arrayWords);
        
    }
    
    private static String mytoString(String[] theArray) {
        String theString = Arrays.toString(theArray);
        return theString.replaceAll(",", "").replace("[", "").replace("]", "");
        }
    
}
        
   
    
    
    


    
    

