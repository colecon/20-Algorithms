//Cole Constantino | Sort array using insertion sort method
public class InsertionSort1{
  public void sortMe(int[] arr){
    //loop forward and at each index loop backwards until it is 
    //no longer bigger than the next
    for(int i = 1; i < arr.length; i++){
      int j = i -1;
      int temp = arr[j+1];
      while(j >= 0 && arr[j] > temp){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }
  }
  
  public static void print(int[] a){
    for(int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
  }
  
  public static void main(String[] args){
    int[] a = {2,43,5,3,7,22,54};
    InsertionSort1 is = new InsertionSort1();
    is.sortMe(a);
    print(a);
  }
}

/*
 *  input:  [4,1,3]
 *  output: [1,3,4]
 */
