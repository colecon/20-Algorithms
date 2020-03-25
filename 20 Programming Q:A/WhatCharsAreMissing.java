//Cole Constantino | Given 2 arrays, return list of chars not present in the second array

import java.util.*;
public class WhatCharsAreMissing{
  public static List<Character> solve(char[] ch1, char[] ch2){
    List<Character> list = new ArrayList<>();
    String s2 = new String(ch2);
    
    for(int i = 0; i < ch1.length; i++){
      if(s2.contains("" + ch1[i]) != true)
        list.add(ch1[i]); 
    }
    return list;
  }
  public static void main(String[] args){
    char[] c1 = {'2','3','4','5'};
    char[] c2 = {'1','2','4'};
    System.out.println(solve(c1,c2));
  }
}

/*
 *  input:  ['a', 's', 's','d'], ['a', 's']
 *  output: ['d']
 * 
 *  input:  ['2','3','4','5'], ['1','2','4']
 *  output: ['3','5']
 */