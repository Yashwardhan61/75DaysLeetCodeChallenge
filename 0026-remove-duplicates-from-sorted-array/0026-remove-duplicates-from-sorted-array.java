class Solution {
    public int removeDuplicates(int[] nums) {
      int n =nums.length;
      int jl=0;
      for (int i=1;i<n;i++){
        if (nums[i]!=nums[jl]){
            jl++;
        }
        nums[jl]=nums[i];
      }  //output
      return jl+1;
    }
    
}