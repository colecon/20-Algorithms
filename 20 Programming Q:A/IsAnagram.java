//Cole Constantino | Check if two String are Anagrams?
import java.util.*;
public class IsAnagram{
  public static boolean isAnagram(String s1, String s2){
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    if(Arrays.equals(c1, c2)) return true;
    return false;
  }
  
  public static void main(String[] args){
    String s1 = "racecar", s2 = "carrace";
    System.out.println(isAnagram(s1,s2));
  }
}

/*
 *   input:  "abcd", "cbad"
 *   output:  True
 */