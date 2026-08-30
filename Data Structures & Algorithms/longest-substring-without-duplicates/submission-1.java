class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, length = 0, bestLength = 0;

        Map<Character, Integer> hm = new HashMap<>();

        while (right < s.length()) {
            if (hm.containsKey(s.charAt(right))) {
                left = Math.max(left, hm.get(s.charAt(right)) + 1);
            }

            hm.put(s.charAt(right), right);
            length = right - left + 1;
            if (length > bestLength) {
                bestLength = length;
            }
            right++;
        }
        return bestLength;
    }
}
