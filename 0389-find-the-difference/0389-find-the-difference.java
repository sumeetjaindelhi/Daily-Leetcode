class Solution {
    public char findTheDifference(String s, String t) {
        short[] alph = new short[26];
        for (char c : s.toCharArray()) {
            alph[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alph[c - 'a']--;
        }
        for (int i = 0; i < alph.length; i++) {
            if (alph[i] != 0) return (char)(i + 'a');
        }
        return 'a';
    }
}