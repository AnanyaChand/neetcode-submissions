# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if root==None and subRoot==None:
            return True
        if root==None:
            return False
        if subRoot==None:                                                                                      
            return True
        #if root!=None and subRoot!=None:
        if self.isSametree(root,subRoot):
            return True
        l=self.isSubtree(root.left,subRoot)
        r=self.isSubtree(root.right,subRoot)
        return l  or r
        
    def isSametree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p==None and q==None:
            return True
        if p==None or q==None:
            return False
        if p.val==q.val:
            a=self.isSametree(p.left,q.left)
            b=self.isSametree(p.right,q.right)
            return a and b
        return False
        