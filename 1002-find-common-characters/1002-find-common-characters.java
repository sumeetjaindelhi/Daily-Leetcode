class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        String word = words[0];

        if(n == 1){
            for(char ch : word.toCharArray())
                res.add(""+ch);
            return res;
        }


        for(char ch : word.toCharArray()){
            boolean flag = true;

            for(int indx = 1; indx < n; indx++){
                if(!words[indx].contains(""+ch)){
                    flag = false;
                    break;
                }
                else{
                    StringBuilder sb = new StringBuilder(words[indx]);
                    int ind = sb.indexOf(""+ch);
                    if(ind >= 0){
                        sb.setCharAt(ind, '.');
                        words[indx] = sb.toString();
                    }
                }
            }
            if(flag == true)
                res.add(""+ch);
        }
        return res;
    }
}