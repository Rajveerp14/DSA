class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            }
        }
        if (uppercaseCount == 0 || uppercaseCount == word.length()) {
            return true;
        }
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
         return false;
    }
}
