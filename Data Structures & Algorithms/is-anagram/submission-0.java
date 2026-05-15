class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        for (char c : s.toCharArray()) {
            int i = t.indexOf(c);
            if (i == -1)
                return false;
            t = t.substring(0, i) + t.substring(i + 1);
        }
        return true;
    }
}
