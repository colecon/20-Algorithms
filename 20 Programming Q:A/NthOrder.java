// Cole Constantino | Find the nth highest number in an integer array?
import java.util.*;
public class NthOrder{
  public static int find(int[] nums, int n){
    //Sort and return nth from the end
    Arrays.sort(nums);
    return nums[nums.length - n];
  }
  
  public static void main(String[] args){
    int[] a = {3,5,4,7,6,2};
    System.out.println(find(a,3));
  }
}

/*
 *  input: [3,5,4,7,6,2], 3
 *  output: 5
 */