//Cole Constantino | You and your friend are gardeners and want water your
//line of plants from both sides and meet in the middle. 
//refill and water if you don't have enough in the jug
//How many refills does it take to water every plant?

public class FlowerJugs{
  public static int solution(int[] plants, int cap1, int cap2){
    int myJug = cap1; 
    int hisJug = cap2;
    int refills = 0;
    int j = plants.length -1;
    
    //loop through flowers array from both sides
    for(int i = 0; i <= plants.length/2 ; i++){
      
      //if myJug doesn't have enough -> refill
      if(myJug < plants[i]){
        refills++;
        myJug = cap1;
        myJug = myJug - plants[i];
      }
      else{ //subtract
        myJug = myJug - plants[i];
      }
      
      //if hisJug doesn't have enough -> refill
      if(hisJug < plants[j-i]){
        refills++; 
        hisJug = cap2;
        hisJug = hisJug - plants[j-i];
      }
      else{ //subtract
        hisJug = hisJug - plants[j-i];
      }
  
    }//end for loop
    return refills;
  }
  
  public static void main(String[] args){
    int[] a = {2,4,5,1,2};
    System.out.println(solution(a,5,7));
  }
}

/*
 * input: [2,4,5,1,2], capacity1 = 5, capacity2 = 7
 * output: 3
 */
