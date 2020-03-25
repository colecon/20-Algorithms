//Cole Constantino | Find the min and max depth of a binary tree

public class BSTDepth{
  public static int maxDepth(TreeNode root){
    if(root == null) return 0;
    return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
  }
  
  public static int minDepth(TreeNode root){
    if(root == null) return 0;
    if(root.left == null) return minDepth(root.right) + 1;
    if(root.right == null) return minDepth(root.left) + 1;
    return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    
  }
  
  public static void main(String[] args){
    TreeNode tree = new TreeNode(10); 
    tree.right = new TreeNode(26); 
    tree.left = new TreeNode(3); 
    tree.left.right = new TreeNode(9); 
    tree.left.left = new TreeNode(13); 
    tree.right.left = new TreeNode(4); 
    tree.left.left.right = new TreeNode(30); 
    
    System.out.println("Max Depth of BST: " + maxDepth(tree));
    System.out.println("Min Depth of BST: " + minDepth(tree));
    
    /*
     *           10
     *          /  \
     *        3     26
     *       / \    /     
     *      13  9  4      =>    minDepth: 3
     *        \                 maxDepth: 4
     *         30 
     */
  }
}


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
