class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }

        String r=res.toString();
        int m=r.length();
        for(int i=0;i<m;i++){
            if(i<=m-i-1&&r.charAt(i)!=r.charAt(m-i-1)){
                return false;
            }
        }
        return true;
    }
}
