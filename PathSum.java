//LC-112

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null && targetSum==root.val){
            return true;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
    // public boolean hasPathSum(TreeNode root, int targetSum) {
    //     if(root==null)return false;
    //     int sum=0;
    //     return hasPathSumhelper(root,sum,targetSum);
    // }
    // public boolean hasPathSumhelper(TreeNode root,int sum,int targetSum) {
    //     if(root==null){
    //         return false;
    //     }
    //     sum+=root.val;
    //     if(root.left==null && root.right==null && sum==targetSum){
    //         return true;
    //     }
    //     if(hasPathSumhelper(root.left,sum,targetSum) || hasPathSumhelper(root.right,sum,targetSum)){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
}
