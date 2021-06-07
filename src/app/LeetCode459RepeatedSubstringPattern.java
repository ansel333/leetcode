package app;

/**
 *
 */
public class LeetCode459RepeatedSubstringPattern {

    public static void main(String[] args) {
        String a = "abcababca";
        System.out.println(simple(a));
    }

    /**
     * 暴力枚举法
     *
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int subLength = 1;
        while (subLength <= length / 2) {
            boolean result = true;
            if (length % subLength != 0) {
                result = false;
                subLength++;
                continue;
            }
            String subString = s.substring(0, subLength);

            for (int idx = subLength; idx < length - subLength + 1; idx += subLength) {
                String tempSub = s.substring(idx, idx + subLength);
                if (!subString.equals(tempSub)) {
                    result = false;
                    break;
                }
                if (result && idx + subLength == length) {
                    return true;
                }
            }
            subLength++;

        }

        return false;
    }

    public static boolean simple(String s) {
        String a = s.substring(1) + s.substring(0, s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            if (a.startsWith(s, i)) {
                return true;
            }
        }
        return false;
    }
}
