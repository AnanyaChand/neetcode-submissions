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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>queue =new LinkedList<>();
        List<Integer> output=new ArrayList<>();
        if(root==null){
            return output;
        }
         queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            TreeNode exist=null;
            for(int i=0;i<n;i++){
                exist=queue.poll();
                if(exist.left!=null){
                    queue.offer(exist.left);
                }
                if(exist.right!=null){
                    queue.offer(exist.right);
                }
            }
        output.add(exist.val);
        }
        return output;
    }
}
