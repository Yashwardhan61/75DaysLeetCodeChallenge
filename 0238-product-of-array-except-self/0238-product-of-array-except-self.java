class Solution {
    public int[] productExceptSelf(int[] nums) {
        int no=nums.length;
        int[] answer=new int[no];
        answer[0] = 1;
        for (int i = 1; i < no; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];

        }
         int right = 1;
        for (int i = no - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
//fount the answer
        return answer;

    }
}