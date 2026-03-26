class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int Sum=0;
        for(int i=0;i<k;i++){
            Sum+=nums[i];
        }
        double maxSum=Sum;
        for(int i=k;i<nums.length;i++){
            Sum+=nums[i];
            Sum-=nums[i-k];
            if(Sum>maxSum){
                maxSum=Sum;
            }
        }
        return maxSum/k;
}
}