
//LC-231
//Using divide by 2 
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if((n%2)!=0 || n==0 || n<0) return false;
        while(n>1){
            if(n==2) return true;
            if(((n/2)%2)!=0) return false;
            n=n/2;
        }
        return true;
    }
}

//using bit count of 1
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}

//Using power function
public class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}

//Using left shift
public class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = 1;
        while (x <= n) {
            if (x == n) return true;
            if (x > Integer.MAX_VALUE / 2) break;
            x = x << 1;
        }
        return false;
    }
}

//using Ceil and Floor function
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        return Math.floor(Math.log(n) / Math.log(2)) == Math.ceil(Math.log(n) / Math.log(2));
    }
}

//Using and operator
//And operation between multiple of 2 and next lower number will always give 0 and other wise it will never be 0.

//example 1: 8 & 7
//1000(8) & 0111(7) => 0000(0)

//example 1: = 10 & 9
//1010(10) & 1001(9) => 1000(8)
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
