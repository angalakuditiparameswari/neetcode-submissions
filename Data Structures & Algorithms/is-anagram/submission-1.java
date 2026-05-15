class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            counts.merge(c, -1, Integer::sum);
            if (counts.get(c) < 0) return false;
        }
        return true;
    }

}
