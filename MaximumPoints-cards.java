class Solution {
    public int maxScore(int[] arr, int k) {
        int total=0;
        for(int i=0;i<k;i++){
            total+=arr[i];
        }
        int best=total;
        for(int i=k-1,j=arr.length-1;i>=0;i--,j--){
            total+=arr[j]-arr[i];
            best=Math.max(best,total);
        }
        return best;
    }
}
