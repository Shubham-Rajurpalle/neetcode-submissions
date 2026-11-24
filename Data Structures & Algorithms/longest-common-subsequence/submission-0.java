class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int res[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            res[i][0]=0;
        }

        for(int i=0;i<=m;i++){
            res[0][i]=0;
        }

        char s1[]=text1.toCharArray();
        char s2[]=text2.toCharArray();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1[i-1]==s2[j-1]){
                    res[i][j]=1+res[i-1][j-1];
                }else{
                    res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
                }
            }
        }

        return res[n][m];
    }
}
