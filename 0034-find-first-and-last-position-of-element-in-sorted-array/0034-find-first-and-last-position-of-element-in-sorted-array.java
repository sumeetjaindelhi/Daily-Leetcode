class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
         int mid;
        
        int sol[]=new int[2];
        sol[0]=fp(nums,target);
        sol[1]=lp(nums,target);
        return sol;
    }
    
    public int fp(int []n, int t)
    {
        int ans=-1;
        int s=0;
        int e=n.length-1;
        int mid;
        while(s<=e)
        {
            mid=s+((e-s)/2);
            if(n[mid]==t)
            {
                ans=mid;
                e--;
            }
            else if(n[mid]<t)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    
    public int lp(int []n, int t)
    {
        int ans=-1;
        int s=0;
        int e=n.length-1;
        int mid;
        while(s<=e)
        {
            mid=s+((e-s)/2);
            if(n[mid]==t)
            {
                ans=mid;
                s++;
            }
            else if(n[mid]<t)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
}
