class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        char c[]=s.toCharArray();
        int res=0;
        for(int i=0;i<n;i++){
            res++;
            int x=1;
            while(i-x>=0&&i+x<n&&c[i-x]==c[i+x]){
                res++;
                x++;
            }

            x=1;
            while(i-x+1>=0&&i+x<n&&c[i-x+1]==c[i+x]){
                res++;
                x++;
            }
        }

        return res;
    }
}
