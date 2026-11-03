# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    flag=True
    def height(self, root: Optional[TreeNode]) -> int:
            if root==None:
                return 0
            a=self.height(root.left)
            b=self.height(root.right)
            if abs(a-b>1):
               flag=False
            return 1+max(a,b)

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root==None:
            return True
        if root.left==None and root.right==None:
            return True
        a=self.isBalanced(root.left)
        b=self.isBalanced(root.right)
        if a and b:
            if abs(self.height(root.left)-self.height(root.right))>1:
                return False
            return True
        return False
                  
    

        
