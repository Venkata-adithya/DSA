class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        if(nums == null || nums.length <3)
            return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=nums[i]+nums[j];
                    sum=sum+nums[left];
                    sum=sum+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }            
                }
            }
        }
        return new ArrayList<>(result);
    }
}
