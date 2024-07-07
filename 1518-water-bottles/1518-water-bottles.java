class Solution {
    public int numWaterBottles(int num, int exchange) {
        int ans=num;
        
        
        while(num>=exchange)
        {
            int newbot=num/exchange;
            int empty=num%exchange;
            ans+=newbot;
            num=newbot+empty;
            
            
        }
        
        return ans;
        
        
        
    }
}