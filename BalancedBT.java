//LC-110

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
    public boolean isBalanced(TreeNode root) {
        return depth(root)>=0;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int ldep=depth(root.left);
        int rdep=depth(root.right);
        if(ldep==-1||rdep==-1 || Math.abs(ldep-rdep)>1) return -1;
        return Math.max(ldep,rdep)+1;
    }
}
