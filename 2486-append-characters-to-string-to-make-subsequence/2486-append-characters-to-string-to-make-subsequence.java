class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int n = s.length();
        int m = t.length();

        while (j < m && i < n) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return m - j;
    }
}