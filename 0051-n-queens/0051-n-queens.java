class Solution {
    
    public List<List<String>> solveNQueens(int n) {
         List <List<String>> answer= new ArrayList<>();
        char chess[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                chess[i][j]='.';
            }
        }

        queenPlace(chess,0,answer);
        return answer;
    }
    
    public static void queenPlace(char chess[][], int row,List <List<String>> answer)
    {  
        if(row==chess.length)
    {  ArrayList<String> temp=new ArrayList<>();

        for(int i=0;i<chess.length;i++)
        {   String s="";

            for(int j=0;j<chess.length;j++)
            {
                s+=chess[i][j];
            }
            temp.add(s);

        }

        answer.add(temp);

    }


  for(int i=0;i<chess.length;i++)
  {
    if(isSafe(chess,row,i))
    {
        chess[row][i]='Q';
        queenPlace(chess,row+1,answer);
        chess[row][i]='.';
    }
  }
}

public static boolean isSafe(char chess[][], int row, int col)
{
    for(int i=row-1;i>=0;i--)
    {
        if(chess[i][col]=='Q')
        {
            return false;
        }
    }

    for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--)
    {
        if(chess[i][j]=='Q')
        {
            return false;
        }
    }

    for(int i=row-1, j=col+1;i>=0 && j<chess.length;i--,j++)
    {
        if(chess[i][j]=='Q')
        {
            return false;
        }
    }
    return true;
}
}

