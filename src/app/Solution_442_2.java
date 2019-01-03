package app;

import java.util.ArrayList;
import java.util.List;

public class Solution_442_2 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int index = Math.abs(nums[i]);
            if(nums[index - 1] < 0) {
                list.add(Math.abs(nums[index - 1]));
            } else {
                nums[index - 1] *= -1;
            }
        }
        return list;
    }
}