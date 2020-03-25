//Cole Constantino | Count the occurrence of a given character in a String?
public class CharOccurence{
  public static int count(String s, char c){
    int count = 0;
    while(s.indexOf("" + c) >= 0){
      int i = s.indexOf("" + c);
      s = s.substring(i+1);
      count++;
    }
    return count;
  }
  
  public static void main(String[] args){
    System.out.println(count("bshajdaadjsuaa", 'a'));
  }
}

/* 
 *     input: "abcda" , 'a'
 *     output: 2
 */