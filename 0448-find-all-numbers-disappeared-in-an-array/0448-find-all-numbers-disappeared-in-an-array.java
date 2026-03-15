class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);//first we sort the array
        List<Integer> res = new ArrayList<>();
        int expected = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == expected) {
                expected++;
            } else if (nums[i] > expected) {
                while (expected < nums[i]) {
                    res.add(expected);
                    expected++;
                }
                if (expected == nums[i]) {
                    expected++;
                }
            }
        }
        while (expected <= nums.length) {
            res.add(expected);
            expected++;
        }

        return res;
    }
}