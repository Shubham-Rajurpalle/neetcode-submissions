class Solution {

    class Pair{
        int x,y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public int islandPerimeter(int[][] grid) {
        int a=-1,b=-1;
        int n=grid.length;
        int m=grid[0].length;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    a=i;
                    b=j;
                    break;
                }
            }
            if(a!=-1&&b!=-1){
                break;
            }
        }

        boolean v[][]=new boolean[n][m];
        v[a][b]=true;
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(a,b));

        int dx[]={1,0,-1,0};
        int dy[]={0,1,0,-1};
        int res=0;

        while(!q.isEmpty()){
            Pair temp=q.poll();
            int x=temp.x;
            int y=temp.y;

            for(int i=0;i<4;i++){
                int tx=x+dx[i];
                int ty=y+dy[i];
                if(tx>=0&&ty>=0&&tx<n&&ty<m&&!v[tx][ty]&&grid[tx][ty]==1){
                    v[tx][ty]=true;
                    q.add(new Pair(tx,ty));
                }
                if(tx<0||ty<0||tx>=n||ty>=m||grid[tx][ty]==0){
                    res++;
                }
            }
        }
        return res;
    }
}