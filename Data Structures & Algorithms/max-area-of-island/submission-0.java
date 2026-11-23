class Solution {

    public static final int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
    int res;

    public void dfs(int grid[][], boolean v[][], int i, int j){
        v[i][j]=true;
        int n = grid.length;
        int m = grid[0].length;
        for(int dir[]:d){
            int x = dir[0]+i;
            int y = dir[1]+j;
            if(x>=0&&y>=0&&x<n&&y<m&&!v[x][y]&&grid[x][y]==1){
                res=res+1;
                dfs(grid,v,x,y);
            }
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int area=0;
        boolean v[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!v[i][j]&&grid[i][j]==1){
                    res=1;
                    dfs(grid,v,i,j);
                    area=Math.max(res,area);
                }
            }
        }

        return area;
        
    }
}
