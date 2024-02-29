class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value=image[sr][sc];
        int res[][]= flood(image,sr,sc,color,value);
            return res;
    
    }
public static int [][] flood(int[][] image, int sr, int sc, int color,int value){
    
        if(sr<0 ||sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=value||
                image[sr][sc]==color)
            {
                return image;
            }
             value=image[sr][sc];
            image[sr][sc]=color;
    

           image=flood(image,sr-1,sc,color,value);  //top
            image=flood(image,sr,sc-1,color,value);  //left
           image =flood(image,sr+1,sc,color,value);  //down
            image=flood(image,sr,sc+1,color,value);  //right
    return image;

        }
}