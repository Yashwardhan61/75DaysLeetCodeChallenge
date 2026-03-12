class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();  // value → index
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;// If the needed number exists in the maps, we found our answer
            if (maps.containsKey(needed)) {
                return new int[] { maps.get(needed), i };// Otherwise, store the current number with its index
            }
            maps.put(current, i);
        }
        return new int[] {}; // Since problem guarantees solution, this won't run
    }
}