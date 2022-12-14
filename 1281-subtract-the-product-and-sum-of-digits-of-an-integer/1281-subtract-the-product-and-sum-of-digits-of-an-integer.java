class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum=0;
        int product=1;
        int a;
        while(n!=0)
        {
            a=n%10;
            n=n/10;
            sum+=a;
            product*=a;
        }
        
        return product-sum;
    }
}