class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();
        for(char c: ch){
            if(c=='(')
                st.push(')');
            else if(c=='{')
                st.push('}');
            else if(c== '[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=c)
                return false;
        }
        return st.isEmpty();
    }
}

//without stack
public class Solution {
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }
}
