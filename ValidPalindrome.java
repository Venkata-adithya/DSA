//My Solution;
//LC-125
class Solution {
    public boolean isPalindrome(String s) {
        int len1=s.length();
        if(len1==0) return true;
        String modStr=s.replaceAll("[^a-zA-Z0-9]","");
        String resStr=modStr.toLowerCase();
        int len2=resStr.length();
        int l=0;
        int r=len2-1;
        while(l<r){
            if(resStr.charAt(l)==resStr.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

//Interesting Solution
public class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}

//Optimized solution
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}
