class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1_000_000_007;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                pq.offer(new int[]{sum, j + 1 - i}); 
            }
        }

        int result = 0;
        for (int i = 1; i <= right; i++) {
            int[] current = pq.poll();
            if (i >= left) {
                result = (result + current[0]) % mod;
            }
        }

        return result;
    }
}