class Solution {
   public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1]; 
        int  x1 = coordinates[1][0], y1 = coordinates[1][1];
        int d1 = x1 - x0, d2 = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (d1 * (y - y1) != d2 * (x - x1))
                return false;
        }
        return true;
    }
}