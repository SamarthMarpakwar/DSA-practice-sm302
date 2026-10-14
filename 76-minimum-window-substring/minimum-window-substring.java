class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(s==t){
            return t;
        }
        if(t.length()>s.length()){
            return "";
        }
        Map<Character, Integer> myMap = new HashMap<>();
        for(char c: t.toCharArray()){
            myMap.put(c, myMap.getOrDefault(c,0)+1);
        }
        int countReq = t.length();
        int i = 0,  j = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0; //basically storing the start of substring

        while(j<n){
            char ch = s.charAt(j);
            if(myMap.getOrDefault(ch,0)>0){
                countReq--;
            }
            myMap.put(ch, myMap.getOrDefault(ch,0)-1);
            while(countReq==0){ //start shrinking the window
                int currWindowSize = j-i+1;
                if(minWindowSize>currWindowSize){
                    minWindowSize = currWindowSize;
                    start_i = i;
                }
                myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0) + 1);
                
                if (myMap.get(s.charAt(i)) > 0) {
                    countReq++;
                }
                i++;
            }
            j++;
        
        }
        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i+ minWindowSize);
    }
}