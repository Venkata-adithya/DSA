
//LC-14
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        Arrays.sort(strs);
        int len1=strs.length;
        char ch1[]=strs[0].toCharArray();
        char ch2[]=strs[len1-1].toCharArray();
        int len=Math.min(ch1.length,ch2.length);
        if(strs.length==1){
            return strs[0];
        }
        for(int j=0;j<len;j++){
            if(ch1[j]==ch2[j]){
                res=res+ch1[j];
            }
            else{
                break;
            }
        }
        return res;
    }
}
