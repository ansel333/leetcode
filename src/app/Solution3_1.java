package app;

public class Solution3_1 {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int length = 1;
        int max = 1;

        if(s == null || s.length() == 0) {
            return 0;
        }

        String longestSubstring = s.charAt(0) + "";
        for(int i=1; i < s.length(); i++) {
            char nextChar = s.charAt(i);
            if(longestSubstring.contains(nextChar + "")) {
                int indexOfConflictChar = longestSubstring.indexOf(nextChar + "");
                System.out.println("Conflict char index: " + indexOfConflictChar);
                i = start = start + indexOfConflictChar + 1;
                length = 1;
                longestSubstring = s.substring(start, start + length);
                System.out.println("thread 1: " + longestSubstring + " . start: " + start);
            } else {
                length ++;
                longestSubstring = s.substring(start, start + length);
                System.out.println("thread 2: " + longestSubstring + " . start: " + start);
                if(length > max) {
                    max = length;
                }
            }
        }
        return max;
    }
}