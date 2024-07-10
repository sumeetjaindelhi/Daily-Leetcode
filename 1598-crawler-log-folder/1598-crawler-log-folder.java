class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;
        for (String log : logs) {
            if (!log.equals("./") && !log.equals("../")) {
                counter++;
            } else if (counter > 0 && log.equals("../")) {
                counter--;
            }
        }
        return counter;
    }
}