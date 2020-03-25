//Cole Constantino | Turn a BST into a List<List<Integer>> 
import java.util.*;
public class BSTtoList{ 
  public static List<List<Integer>> solve(TreeNode root){
    List<List<Integer>> list = new ArrayList<>();
    helper(root,0,list);
    //Collections.reverse(list); To reverse Order
    return list;
  }
  
  public static void helper(TreeNode root, int i, List<List<Integer>> list){
    if(root == null) return;
    if(i >= list.size()) list.add(new ArrayList<>());
    list.get(i).add(root.val);
    helper(root.left, i + 1, list);
    helper(root.right, i + 1, list);
    return;  
  }
  
  public static void main(String[] args){
    TreeNode tree = new TreeNode(10); 
    tree.right = new TreeNode(26); 
    tree.left = new TreeNode(3); 
    tree.left.right = new TreeNode(9); 
    tree.left.left = new TreeNode(13); 
    tree.right.left = new TreeNode(4); 
    tree.left.left.right = new TreeNode(30); 
    System.out.println(solve(tree));
  }
}

/*                                 
     *           10                   [[10]                                            
     *          /  \                                               
     *        3     26                 [3, 26],                            
     *       / \    /          ==>                     AKA ==>   [[10], [3, 26], [13, 9, 4], [30]]
     *      13  9  4                   [13, 9, 4]                                    
     *        \                                                       
     *         30                      [30]]                                
     *                             
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