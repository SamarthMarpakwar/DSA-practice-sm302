import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> res = new ArrayList<>();
        if (m > n) return res;

        int[] pCount = new int[26];
        int[] wCount = new int[26];

        for (int i = 0; i < m; i++) {
            pCount[p.charAt(i) - 'a']++;
            wCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, wCount)) res.add(0);

        for (int i = m; i < n; i++) {
            wCount[s.charAt(i) - 'a']++;          // add right
            wCount[s.charAt(i - m) - 'a']--;      // remove left
            if (Arrays.equals(pCount, wCount)) res.add(i - m + 1);
        }

        return res;
    }
}   