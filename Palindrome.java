
//LC-9
class Solution {
    public boolean isPalindrome(int x) {
        String st=String.valueOf(x);
        for(int i=0,j=st.length()-1;i<st.length();i++,j--){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
        }

        return true;
    }
}


// Without converting it into string
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        int rem=0;
        if(x<0 || (x!=0 && x%10==0)) return false;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        return temp==rev;
    }
}
