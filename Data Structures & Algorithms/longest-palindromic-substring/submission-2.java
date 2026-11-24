class Solution {
    public String longestPalindrome(String s) {
        char c[]=s.toCharArray();
        int n=s.length();
        if(n==1)return s;
        int res=0;
        String y="";
        for(int i=0;i<n;i++){
            int x=1;
            if(y.equals(""))y=c[i]+"";
            while(i-x>=0&&i+x<n&&c[i-x]==c[i+x]){
                
                if(res<2*x+1){
                    y=s.substring(i-x,i+x+1);
                    res=2*x+1;
                }
                x++;
            }

            x=1;
            while(i-x+1>=0&&i+x<n&&c[i-x+1]==c[i+x]){
                if(res<2*x){
                    y=s.substring(i-x+1,i+x+1);
                    res=2*x;
                }
                x++;
            }
        }

        return y;
    }
}
