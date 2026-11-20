class Solution {

    public boolean check(char c, char temp){
        if(c==')'&&temp=='('||c==']'&&temp=='['||c=='}'&&temp=='{'){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] c = s.toCharArray();
        for(char x : c){
            if(x=='('||x=='['||x=='{'){
                st.push(x);
            }else if(x==')'||x==']'||x=='}'){
                if(st.isEmpty())return false;
                char temp = st.peek();
                if(!check(x,temp)) return false;
                st.pop();
            }
        }

        return st.isEmpty();
    }
}
