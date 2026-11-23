class Solution {
    public int climbStairs(int n) {
        int res[]=new int[n+1];
        if(n==0||n==1)return n;
        res[0]=0;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;i++){
            res[i]=res[i-2]+res[i-1];
        }
        return res[n];
    }
}
