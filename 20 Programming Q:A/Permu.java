//Cole Constantino | Print all permutation of String both iterative and Recursive way?
import java.util.*;
public class Permu{
  
  public static void recursivePerm(String oldStr, String newStr){
    if(oldStr.length() == 0){
      System.out.println(newStr);
      return;
    }
      for(int i = 0; i < oldStr.length(); i++){
        char ch = oldStr.charAt(i);
        String rest = oldStr.substring(0,i) + oldStr.substring(i+1);
        recursivePerm(rest,newStr + ch);
      }
  }
  
  public static void main(String[] args){
    String s = "abc";
    recursivePerm(s,"");
    //System.out.println(s2);
  }
}

/*
 * input: "ab"
 * output: ab, ba
 */