//LC-268
//Using List Class
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int n: nums)
            list.add(n);
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<=max;i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}


//Using XOR
class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        for(int i=0;i<=nums.length;i++){
            res=res^i;
        }
        for(int n:nums){
            res=res^n;
        }
        return res;
    }
}


//Using sum
class Solution {
    public int missingNumber(int[] nums) { //sum
    int len = nums.length;
    int sum = (0+len)*(len+1)/2;
    for(int i=0; i<len; i++)
        sum-=nums[i];
    return sum;
   }
}
