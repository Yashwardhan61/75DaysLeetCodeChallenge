class Solution {

    public boolean isValid(String si) {
        int[] index = new int[1];
        return check(si, index) && index[0] == si.length();
    }

    private boolean check(String s, int[] index) {
        if (index[0] >= s.length()) return true;

        char ch = s.charAt(index[0]);

        if (ch == '(' || ch == '{' || ch == '[') {
            char open = ch;
            index[0]++;
            if (!check(s, index)) 
                return false;

            if (index[0] >= s.length()) 
                return false;

            char close = s.charAt(index[0]);
            if (!isMatching(open, close)) 
                return false;

            index[0]++; 
                return check(s, index);
        }
        if (ch == ')' || ch == '}' || ch == ']') {
            return true;
        }

        return false;
    }

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}