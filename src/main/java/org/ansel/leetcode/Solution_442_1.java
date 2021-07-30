package org.ansel.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_442_1 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for(Integer a: nums) {
            if(uniqueSet.contains(a)) {
                list.add(a);
            } else {
                uniqueSet.add(a);
            }
        }
        return list;
    }
}