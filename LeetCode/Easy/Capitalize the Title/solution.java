class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
        int n = ch.length;
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && ch[j] != ' ') {
                ch[j] = Character.toLowerCase(ch[j]);
                j++;
            }
            if (j - i > 2) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            i = j + 1;
        }

        return new String(ch);
    }
}