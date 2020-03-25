//Cole Constantino | Write a method which will remove any given index from a String? 
//Write a method to remove all instances of a char in a string
public class RemoveChar{
  public static String removeAll(String s, char c){
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    while(sb.toString().indexOf(String.valueOf(c)) >= 0){
      int index = sb.toString().indexOf(String.valueOf(c));
      sb.deleteCharAt(index);
    }
    return sb.toString();
  }
  
  public static String remove(String s, int n){
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    sb.deleteCharAt(n);
    return sb.toString();
  }
  public static void main(String[] args){
    String s = "test trial 1";
    String s2 = "test trial 2";
    
    System.out.println(removeAll(s,'t'));
    System.out.println(remove(s, 3));
  }
}

/* removeAll method -> remove all instances of given char
 *   input: "test trial 1", 't'
 *  output: "es rial 1"
 * 
 * remove method -> remove index from string
 *   input: "test trial 1", 3
 *  output: "tes trial 1
 */