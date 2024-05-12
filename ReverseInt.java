
//LC-7
class Solution {
    public int reverse(int x) {
        long n=x;
        long res=0;
        if(x<0) x=x*-1;
        while(x>0){
            res=(res*10)+x%10;
            x=x/10;
        }
        if(n<0) res=res*-1;
        if(!isInRange(res,Math.pow(-2,31),Math.pow(2,31)-1)){
            return 0;
        }
        
        return (int)res;
    }
    public static boolean isInRange(long number, double lowerBound, double upperBound) {
        return (number >= lowerBound && number <= upperBound);
    }
}

//optimized code
public int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }

//without using long
  public int reverse(int x) {
        int prevRev = 0 , rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            if((rev - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = rev;
            x= x/10;
        }
        return rev;
    }
