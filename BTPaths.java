//LC-257

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
    // public List<String> binaryTreePaths(TreeNode root) {
    //     List<String> res=new ArrayList<String>();
    //     helper(root,"",res);
    //     return res;
    // }
    // public void helper(TreeNode root,String r,List<String> res){
    //     if(root==null){
    //         return;
    //     }
    //     r=r+root.val;
    //     if(root.left==null && root.right==null){
    //         res.add(r);
    //     }
    //     else{
    //         r=r+"->";
    //         helper(root.left,r,res);
    //         helper(root.right,r,res);
    //     }
    // }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<String>();
        helper(root,new StringBuilder(),res);
        return res;
    }
    public void helper(TreeNode root,StringBuilder r,List<String> res){
        if(root==null){
            return;
        }
        int len=r.length();
        if(len>0){
            r.append("->");
        }
        r.append(root.val);
        if(root.left==null && root.right==null){
            res.add(r.toString());
        }
        else{
            helper(root.left,r,res);
            helper(root.right,r,res);
        }
        r.setLength(len);
    }
}
