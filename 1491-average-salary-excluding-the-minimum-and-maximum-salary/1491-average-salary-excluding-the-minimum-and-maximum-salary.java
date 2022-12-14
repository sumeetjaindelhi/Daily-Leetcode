class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < salary.length; i++) {
            int value = salary[i];
            if (value < min) {
                min = value;
            } 
            if(value > max) {
                max = value;
            }
            sum += value;
        }
        int result = sum - min - max;
        return result / ((salary.length - 2) * 1.0);
    }
}