class Solution {

    private static final int[][] d={{1,0},{-1,0},{0,1},{0,-1}};

    class Pair{
        int x,y;
        Pair(int i, int j){
            this.x=i;
            this.y=j;
        }
    }

    public void bfs(char grid[][], boolean v[][], int i, int j){
        v[i][j]=true;
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair t = q.poll();
            for(int[] px:d){
                int ix = px[0]+t.x;
                int jy = px[1]+t.y;
                if(ix>=0&&ix<n&&jy>=0&&jy<m&&!v[ix][jy]&&grid[ix][jy]=='1'){
                    q.add(new Pair(ix,jy));
                    v[ix][jy]=true;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean v[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!v[i][j]&&grid[i][j]=='1'){
                    bfs(grid,v,i,j);
                    count++;
                }
            }
        }

        return count;
    }
}
