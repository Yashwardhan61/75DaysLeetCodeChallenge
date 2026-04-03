class Solution {

    public int search(int[] numss, int target) {
        return recursiveSearch(numss, target, 0, numss.length - 1);
    }
    private int recursiveSearch(int[] numss, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (numss[mid] == target) {
            return mid;
        }
        if (target < numss[mid]) {
            return recursiveSearch(numss, target, left, mid - 1);
        }
        return recursiveSearch(numss, target, mid + 1, right);
    }
}