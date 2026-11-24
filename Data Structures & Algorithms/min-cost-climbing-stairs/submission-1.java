class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int res[]=new int[n+1];
        res[0]=0;
        res[1]=cost[0];
        for(int i=2;i<=n;i++){
            res[i]=Math.min(res[i-1]+cost[i-1],res[i-2]+cost[i-2]);
        }

        int fr=res[n];
        res[1]=0;
        for(int i=2;i<=n;i++){
            res[i]=Math.min(res[i-1]+cost[i-1],res[i-2]+cost[i-2]);
        }
        return Math.min(fr,res[n]);
    }
}
