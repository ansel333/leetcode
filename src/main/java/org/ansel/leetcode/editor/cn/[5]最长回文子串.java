package org.ansel.leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution_05 {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i - 1, i);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    // 在 s 中寻找以 s[l] 和 s[r] 为中心的最长回文串
    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
//runtime:19 ms
//memory:42.2 MB

//leetcode submit region end(Prohibit modification and deletion)
