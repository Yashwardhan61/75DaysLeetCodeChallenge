class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char c2 = s.charAt(left);
            char c3 = s.charAt(right);

            if (!Character.isLetterOrDigit(c2)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(c3)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(c2) != Character.toLowerCase(c3)) {
                return false;
            }//done

            left++;
            right--;
        }
        return true;
    }
}