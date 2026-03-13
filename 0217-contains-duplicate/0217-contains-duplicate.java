class Solution {
    public boolean containsDuplicate(int[] nums) {//HashSet approach 
        HashSet<Integer> set = new HashSet<>();// HasSet contains only unique elements
        for (int numm : nums) {//foreach loop syntax
            if (set.contains(numm)) {
                return true;
            }
            set.add(numm);
        }
        return false;
    }
}
