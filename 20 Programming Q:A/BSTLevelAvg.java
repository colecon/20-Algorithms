//Cole Constantino | Given BST return avg of each level in a list
import java.util.*;
public class BSTLevelAvg {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        helper(root, 0, list,count);
        return list;
    }
    public static void helper(TreeNode root, int i, List<Double> list, List<Integer> count){
        if(root == null) return;
        if(i >= list.size()){
            list.add(root.val * 1.0); //or typecast
            count.add(1);  
        }
        else{
           list.set(i,(root.val + (list.get(i)*count.get(i)))/(count.get(i)+1)); 
           count.set(i,count.get(i) + 1);     
        }
        helper(root.left, i+1, list, count);
        helper(root.right, i+1, list, count); 
    }
    
    public static void main(String[] args){
      TreeNode tree = new TreeNode(10); 
      tree.right = new TreeNode(26); 
      tree.left = new TreeNode(3); 
      tree.left.right = new TreeNode(9); 
      tree.left.left = new TreeNode(13); 
      tree.right.left = new TreeNode(4); 
      tree.left.left.right = new TreeNode(30); 
      System.out.println(averageOfLevels(tree));
      
    }
}

    /*   
     *
     *
     *           10                   [[10],                      [[10],                                         
     *          /  \                                               
     *        3     26                 [3, 26],                    [14.5],                
     *       / \    /          ==>                       ==>   
     *      13  9  4                   [13, 9, 4],                 [8.667],                           
     *        \                                                       
     *         30                      [30]]                       [30.0]]         
     *                             
     *                              
     */ 



/*
 * Uncomment if running class by itself
 * 
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int newVal){
    this.val = newVal;
    this.left = null;
    this.right = null;
  }
}
*/
