class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int start = 0;
        for(int i = 0; i < pattern.length() && start < s.length(); i++) {
            char c = pattern.charAt(i);
            int end = start;
            while(s.charAt(end)!=' ') {
                end++;
                if(end == s.length()) {
                    if(i == pattern.length()-1) break;
                    else return false;
                }
                
            }
            String word = s.substring(start, end);
            if(map.containsKey(c)) {
                if(!word.equals(map.get(c))) return false;
            }
            else {
                if(!set.contains(word)) {
                    map.put(c, word);
                    set.add(word);
                }
                else return false;
            }
            start = end+1;
        }
        if(start < s.length()) return false;
        return true;
    }
}