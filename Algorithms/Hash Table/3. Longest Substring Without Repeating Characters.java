class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max_length = 0;
        
        HashSet<Character> hashset = new HashSet();
        
        while ( j < s.length()) {
            if (!hashset.contains(s.charAt(j))){
                hashset.add(s.charAt(j));
                j++;
                max_length = Math.max( j - i, max_length);
            } else {
                hashset.remove(s.charAt(i));
                i++;
            }
        }
        return max_length;
    }
}
