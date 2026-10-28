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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>output=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return output;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
             List<Integer>level=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode exist=queue.poll();
                level.add(exist.val);
                if(exist.left!=null){
                queue.offer(exist.left);
                }
                if(exist.right!=null){
                queue.offer(exist.right);
                }
            }
            output.add(level);
        }
        return output;
    }
}
