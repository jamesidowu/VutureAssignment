/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesidowu.vuturetaskone;

/**
 *
 * @author jamesidowu
 * Vuture Task 1
 * Create a function which counts the number of occurrences of a given letter in a string.
 */
public class LetterOccurrence implements IOccurrence {
    
    private char c;
    private String str;
    private int count;
    
    
    public LetterOccurrence(char c, String str){
        this.str = str;
        this.c = c;
    }
    
    
    
      public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    @Override
    public int countOccurrence(){
        
        for (int i = 0; i < this.str.length(); i++){
            if (this.str.charAt(i) == this.c){
                this.count++;
            }
            
            
        }
        return count;
    } 

  
    
}
