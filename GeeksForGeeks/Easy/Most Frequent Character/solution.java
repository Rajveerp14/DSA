class Solution {
    public static char getMaxOccuringChar(String s) {
        int[] count = new int[26];
   
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        char result = 'a';
        int maxCount = -1;
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = (char) ('a' + i);
            }
        }
        return result;
    }
}