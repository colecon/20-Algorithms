//Cole Constantino | Iterative print in-order traversal of BST
import java.util.*;
public class IterativeSubtree{
  
  public static void inorderIterative(TreeNode root){
    // create an empty stack
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    
    // if current node is null and stack is also empty, we're done
    while (!stack.empty() || curr != null){
      if (curr != null){
        stack.push(curr);
        curr = curr.left;
      }
      else{
        curr = stack.pop();
        System.out.print(curr.val + " ");
        curr = curr.right;
      }
    }
  }
  
  //Main Method and Tree setup
  public static void main(String[] args){
    TreeNode a = new TreeNode(5);
    TreeNode b = new TreeNode(3);
    TreeNode c = new TreeNode(2);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(7);
    TreeNode f = new TreeNode(9);
    a.left = b;
    a.left.left = c;
    a.left.right = d;
    a.right = e;
    a.right.right = f;
    
    long start = System.currentTimeMillis();
    inorderIterative(a);
    long stop = System.currentTimeMillis();
    System.out.println("\nSolution runtime: " + (stop - start) + " ms");
  }
}

/*
 *           5
 *          / \
 *        3     7      ==>  2 3 4 5 6 7 9
 *       / \     \   
 *      2   4     9
 *         
 */


class TreeNode{
  TreeNode left;
  TreeNode right;
  int val;
  TreeNode(int val){
    this.val = val;
  }
}