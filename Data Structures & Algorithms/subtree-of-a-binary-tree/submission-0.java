/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     if(subRoot==null){
        return true;
     }
     if(root==null){
        return false;
     }
     if(root.val==subRoot.val){
        boolean l_equal=isSame(root.left,subRoot.left);
        boolean r_equal=isSame(root.right,subRoot.right);
        if(l_equal && r_equal){
            return true;
        }
     }
     boolean  ls_equal=isSubtree(root.left,subRoot);
     boolean rs_equal=isSubtree(root.right,subRoot);
     if(ls_equal || rs_equal){
        return true;
     }
     return false;
     }

     public boolean isSame(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.val!=subRoot.val){
            return false;
        }
        boolean left_equal=isSame(root.left,subRoot.left);
        boolean right_equal=isSame(root.right,subRoot.right);
        return left_equal  && right_equal;
        }
     }
    

