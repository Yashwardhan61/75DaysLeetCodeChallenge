class Solution {
    public boolean isAnagram(String ss, String t) {
        if (ss.length() != t.length()) 
            return false;
        HashMap<Character, Integer> maps = new HashMap<>();
        for (char c : ss.toCharArray()) {
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!maps.containsKey(c)) return false;
            maps.put(c, maps.get(c) - 1);
            if (maps.get(c) == 0) maps.remove(c);
        }
        return maps.isEmpty();
    }
}