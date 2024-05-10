
//LC-168
class Solution {
    public String convertToTitle(int n) {
        StringBuilder res=new StringBuilder();
        while(n>0){
            n--;
          //remainder=(n%26);
          //To convert it into required character we are adding 'A' 
          //it returns ascii value of req character so we have to convert it into char
            res.insert(0,(char)('A'+(n%26)));
            n=n/26;
        }
        return res.toString();
    }
}
