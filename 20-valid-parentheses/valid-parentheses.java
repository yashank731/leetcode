import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        char[] map = new char[n];
        int i = -1;
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(': { map[++i] = ')'; break; }
                case '[': { map[++i] = ']'; break; }
                case '{': { map[++i] = '}'; break; }
                default:
                    if (i < 0 || map[i] != c) {
                        return false;
                    }
                    i--;
            }
        }
        return i == -1;
    }
}