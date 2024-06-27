//LC-236

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode leftN=lowestCommonAncestor(root.left,p,q);
        TreeNode rightN=lowestCommonAncestor(root.right,p,q);
        if(leftN!=null && rightN!=null){
            return root;
        }
        return leftN!=null?leftN:rightN;
    }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     ArrayList<TreeNode> pAns=new ArrayList<>();
    //     ArrayList<TreeNode> qAns=new ArrayList<>();
    //     if(!findAns(root,p,pAns)){
    //         return null;
    //     }
    //     if(!findAns(root,q,qAns)){
    //         return null;
    //     }
    //     pAns.retainAll(qAns);
    //     return pAns.get(pAns.size()-1);
    // }

    // public boolean findAns(TreeNode root,TreeNode target,ArrayList<TreeNode> res){
    //     if(root==null){
    //         return false;
    //     }
    //     res.add(root);
    //     if(root==target){
    //         return true;
    //     }
    //     if(findAns(root.left,target,res) || findAns(root.right,target,res)){
    //         return true;
    //     }
    //     res.remove(res.size()-1);
    //     return false;
    // }
}
