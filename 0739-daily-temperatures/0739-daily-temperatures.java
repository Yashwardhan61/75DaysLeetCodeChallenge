class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        int n = temperature.length;
        int[] ans = new int[n];
        for(int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            while(j < n) {
                if(temperature[j] > temperature[i]) {
                    ans[i] = j - i;
                    break;
                }
                if(ans[j] == 0) {
                    break;
                }
                j = j + ans[j];
            }
        }
        return ans;
    }
}