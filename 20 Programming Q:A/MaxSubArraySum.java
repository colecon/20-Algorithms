//Cole Constantino | Find the maximum sub-array sum in the array
import java.util.*;
public class MaxSubArraySum{
  public static int maxSubArray(int[] nums){
    int sum = nums[0];
    int max = nums[0];
    for (int i=1;i<nums.length;i++) {
      sum = sum + nums[i];
      sum = nums[i] > sum?nums[i]:sum;
      max = Math.max(sum, max);
    }
    return max;
  }
  public static void main(String[] args){
    int[] a = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(a));
  }
}

/*
 * input: [-2,1,-3,4,-1,2,1,-5,4]
 * output: 6                     
 * because: [4,-1,2,1] sums to 6
 */