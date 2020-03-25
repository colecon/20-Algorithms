// Cole Constantino | Find the first non-repeated character of a given String 
public class FirstNonRepeatedChar{
  public static String solve(String s){
    for(int i = 0; i < s.length(); i++){
      if(s.substring(i+1).indexOf(String.valueOf(s.charAt(i))) < 0)
        return String.valueOf(s.charAt(i));
    }
    return "No repeats";
  }
  public static void main(String[] args){
    System.out.println(solve("aisufhgya"));
  }
}

/*
 *    input: "one for one"
 *    output: "f"
 */