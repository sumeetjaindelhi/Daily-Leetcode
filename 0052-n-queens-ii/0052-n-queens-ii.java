class Solution {
    
    public int totalNQueens(int n) {
       int c=nqueen(new int [n][n],0);
        return c;
    }

public static int nqueen(int chess[][],int r)
{
    if(r==chess.length)
    {
      
      return 1;
    }
     
    int count = 0;
    
    for(int i=0;i<chess[0].length;i++)
    {
        if(issafe(chess,r,i))
        {
            chess[r][i]=1;
            count+=nqueen(chess,r+1);
            chess[r][i]=0;
        }
    }
    return count;
}

public static boolean issafe(int chess[][],int r, int c)
{
    for(int i=r-1,j=c;i>=0;i--)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    for(int i=r-1, j=c-1;i>=0 &&j>=0;i--,j--)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    for(int i=r-1, j=c+1;i>=0 && j<chess.length;i--,j++)
    {
        if(chess[i][j]==1)
        {
            return false;
        }
    }
    return true;
}
}