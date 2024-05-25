//LC-496

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],-1);
        }
        for(int j=nums2.length-1;j>=0;j--){
            while(!st.isEmpty() && nums2[j]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(nums2[j]);
            }
            if(!st.isEmpty() && nums2[j]<st.peek()){
                map.put(nums2[j],st.peek());
                st.push(nums2[j]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     map.put(nums1[i],-1);
        // }
        // for(int j=0;j<nums2.length-1;j++){
        //     if(map.containsKey(nums2[j])){
        //         for(int k=j+1;k<nums2.length;k++){
        //             if(nums2[j]<nums2[k]){
        //                 map.put(nums2[j],nums2[k]);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // int[] ans=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++){
        //     ans[i]=map.get(nums1[i]);
        // }
        // return ans;
    }
}
