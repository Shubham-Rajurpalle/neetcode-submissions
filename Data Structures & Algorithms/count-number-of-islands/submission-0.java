class Solution {

    public void dfs(char[][] grid, boolean[][] v, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        v[i][j]=true;
        int dx[]={1,0,-1,0};
        int dy[]={0,1,0,-1};
        for(int d=0;d<4;d++){
            int x=i+dx[d];
            int y=j+dy[d];
            if(x>=0&&x<n&&y>=0&&y<m&&!v[x][y]&&grid[x][y]=='1'){
                dfs(grid,v,x,y);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean v[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!v[i][j]&&grid[i][j]=='1'){
                    dfs(grid,v,i,j);
                    count++;
                }
            }
        }

        return count;
    }
}
