//LC-530

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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        getValues(root,arr);
        int minDiff=Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=1;i<arr.size();i++){
            int diff=arr.get(i)-arr.get(i-1);
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
    }

    public void getValues(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        getValues(root.left,arr);
        getValues(root.right,arr);
        return;
    }
}
