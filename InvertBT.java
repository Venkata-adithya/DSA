//LC-226

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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        return root;
        //Recursive Approach
        // if(root==null){
        //     return root;
        // }
        // TreeNode left=invertTree(root.left);
        // TreeNode right=invertTree(root.right);
        // root.left=right;
        // root.right=left;
        // return root;
    }
}
