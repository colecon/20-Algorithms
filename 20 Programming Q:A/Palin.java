//Cole Constantino | Is string a palindrome?
public class Palin{
  public static boolean isPalindrome(String s){
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) != s.charAt(s.length() - i -1)) return false;
    }
    return true;
  }
  public static void main(String[] args){
    String s = "abcbas";
    System.out.println(isPalindrome(s));
  }
}

/*
 * input: "abccba"
 * output: True
 */