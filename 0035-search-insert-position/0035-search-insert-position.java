class Solution {

    public int searchInsert(int[] nums, int target) {
        int indexs=0;
        for (int i=0;i<nums.length;i++){
            if (target==nums[i]){
                indexs=i;
            }
            else if (nums[i]<target){
                indexs=i+1;
                }
            }
             return indexs;
        }
       
    }