
//LC-67
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        return x.add(y).toString(2);
    }
}


//Without using predefined classes
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String res="";
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            carry=sum>1?1:0;
            res=(sum%2)+res;
        }
        if(carry!=0) res=carry+res;
        return res;
    }
}
