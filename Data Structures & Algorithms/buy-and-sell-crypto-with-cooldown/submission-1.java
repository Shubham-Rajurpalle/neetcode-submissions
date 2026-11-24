class Solution {
    int s;
    int dp[][]=new int[s][s];

    public int maxR(int prices[], int i, int b){
        int n=prices.length;
        if(i>=n)return 0;
        
        if(dp[i][b+1]!=Integer.MIN_VALUE)return dp[i][b+1];
        int res=0;
        res=Math.max(res,maxR(prices,i+1,b));
        if(b==-1){
            res=Math.max(res,maxR(prices,i+1,i));
        }else{
            res=Math.max(res,maxR(prices,i+2,-1)+prices[i]-prices[b]);
        }
        dp[i][b+1]=res;
        return res;
    }
    public int maxProfit(int[] prices) {
        int s=prices.length;
        dp=new int[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return maxR(prices,0,-1);
    }
}
