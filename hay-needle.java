
//LC-28
//Consider all Testcases
class Solution {
    public int strStr(String haystack, String needle) {
        char[] h=haystack.toCharArray();
        char[] n=needle.toCharArray();
        int r=0;
        int i=0;
        if(h.length<n.length) return -1;
        for(int l=0;l<h.length;l++){
            i=l;
            while((l<h.length || r<n.length) && h.length-l>=n.length-r){
                if(h[l]==n[r]){
                    l++;
                    r++;
                    if(r==n.length){
                        return i;
                    }
                }
                else{
                    r=0;
                    l=i;
                    break;
                }
            }
        }
        return -1;
    }
}
