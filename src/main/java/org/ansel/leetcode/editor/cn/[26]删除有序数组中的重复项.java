package org.ansel.leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast-1]) {
                // new value found, slow++ and give it new value
                slow += 1;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
