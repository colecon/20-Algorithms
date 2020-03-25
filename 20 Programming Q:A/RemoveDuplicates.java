//Cole Constantino | Remove all occurrences in array and return it
import java.util.*;
public class RemoveDuplicates{
  public static int[] remove(int[] arr){
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < arr.length; i++){
      set.add(arr[i]);
    }
    int[] ans = new int[set.size()];
    int j = 0;
    for(Integer x : set){
      ans[j] = x;
      j++;
    }
    return ans;
  }
  
  public static void main(String[] args){
    int[] a = {1,5,3,2,3,3,4,5,2,3};
    a = remove(a);
    System.out.println(Arrays.toString(a));
  }
}

/*
 *    input: [1,5,3,2,3,3,4,5,2,3]
 *   output: [1,2,3,4,5]
 */