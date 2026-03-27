class Solution {
    public int lengthOfLongestSubstring(String s) {
            int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int le = 0, r = 0, maxLen = 0;
        while (r < n) {
            char ch = s.charAt(r);
            if (map.containsKey(ch) && map.get(ch) >= le) {
                le = Math.max(map.get(ch) + 1, le);
            }
            int len = r - le + 1;
            maxLen = Math.max(maxLen, len);
            map.put(ch, r);
            r++;
        }//answer
        return maxLen;
    }
}