import java.util.*;
public class PlusOne{
  public static int[] plusOne(int[] digits) {
        //1,2,3,4
        if(digits.length == 0) return digits;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < digits.length; i++) sb.append(digits[i]); 
        
        String str = sb.toString(); //"1234"
        int tempNum = Integer.parseInt(str); // 1234
        tempNum = tempNum + 1;//1235
        str = String.valueOf(tempNum); //"1235"
        int[] newArr = new int[str.length()];
        for(int j = 0; j < newArr.length; j++){
            newArr[j] = Character.getNumericValue(str.charAt(j));
        }//[1,2,3,5]
        
        return newArr;
    }
  public static void main(String[] args){
    int[] a = {9,9,9};
    int[] newA = plusOne(a);
    System.out.println(Arrays.toString(newA));
  } 
}

/*
 * input:  [1,2,3]   input:  [1,2,3,9]    input: [9,9,9]  
 * output: [1,2,4]   output: [1,2,4,0]   output: [1,0,0,0]
 */