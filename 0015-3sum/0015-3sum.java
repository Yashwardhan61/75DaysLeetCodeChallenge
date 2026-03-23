class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    if (arr == null || arr.length < 3) 
        return new ArrayList<>();
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();
    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int l = i + 1;
      int r = arr.length - 1;
      while (l< r) {
        int sum = arr[i] + arr[l] + arr[r];
        if (sum == 0) {
          // Add the set, and move to find other triplets
          result.add(Arrays.asList(arr[i], arr[l], arr[r]));
          l++;
          r--;
        } else if (sum < 0)
          l++;
        else
          r--;
      }
    }
    return new ArrayList<>(result);
    }
}