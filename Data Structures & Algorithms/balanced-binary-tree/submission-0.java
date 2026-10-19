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
    boolean balanced=true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced;
    }

        public int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
           int  diff=Math.abs(left-right);
           if(diff>1){
            balanced=false;
           }
           int maxi=1+Math.max(left,right);
            System.out.println(diff);
            return maxi;
        }

    }

