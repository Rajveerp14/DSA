class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            else {
                result.append(ch);
            }
        } 
        
        return result.toString();
    }
}