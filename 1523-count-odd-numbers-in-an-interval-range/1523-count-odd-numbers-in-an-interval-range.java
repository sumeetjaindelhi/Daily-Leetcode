class Solution {
    public int countOdds(int low, int high) {
        
      int c=high-low;
       c=c/2;
       
        if(low%2==0 && high%2==0)
        { return c;}
        
        return ++c;
        
    }
}