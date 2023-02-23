package org.ansel.leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution_01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
