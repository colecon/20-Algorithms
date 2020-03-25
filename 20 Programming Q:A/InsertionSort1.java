//Cole Constantino | Sort array using insertion sort method
public class InsertionSort1{
  public void sortMeBitch(int[] arr){
    //loop forward and at each index loop backwards until it is 
    //no longer bigger than the next
    for(int i = 1; i < arr.length; i++){
      int temp = arr[i];
      int count = i;
      while(temp < arr[count-1]){
        arr[count] = arr[count -1];
        arr[count-1] = temp;
        count--;
      }
    }
  }
  
  public static void print(int[] a){
    for(int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
  }
  
  public static void main(String[] args){
    int[] a = {2,43,5,3,7,22,54};
    InsertionSort1 is = new InsertionSort1();
    is.sortMeBitch(a);
    print(a);
  }
}

/*
 *  input:  [4,1,3]
 *  output: [1,3,4]
 */