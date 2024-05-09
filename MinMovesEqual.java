//LC-453
class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            minval=Math.min(nums[i],minval);
        }
        for(int i=0;i<nums.length;i++){
            res=res+(nums[i]-minval);
        }
        return res;
    }
}
