class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[0]-arr[1];
        for(int i=1;i<arr.length-1;i++)
        {
            int diff=arr[i]-arr[i+1];
            
            if(diff!=d)
            {
                return false;
            }
        }
        return true;
    }
}