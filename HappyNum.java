
//LC-202
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int res=0;
        int rem=0;
        while(res!=1){
            res=0;
            while(n>0){
                rem=n%10;
                res=res+(rem*rem);
                n=n/10;
            }
            if(list.contains(res)){
                return false;
            }else{
                list.add(res);
                n=res;
            }
        }
        return true;
    }
}
