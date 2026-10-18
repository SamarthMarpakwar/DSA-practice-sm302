class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, n = s.length(), max_length = 0;
        List<Character> list = new ArrayList<Character>();

        while(j<n){
            if(!list.contains(s.charAt(j))){
                list.add(s.charAt(j));
                j++;
                max_length = Math.max(max_length, list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }
        return max_length;
    }
}