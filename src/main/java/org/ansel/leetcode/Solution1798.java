package org.ansel.leetcode;

import java.util.Arrays;

/**
 * @author ansel
 */
public class Solution1798 {

    public static void main(String[] args) {
        int[] coins = new int[]{1, 4, 10, 3, 1};
        System.out.println(getMaximumConsecutive(coins));
    }

    public static int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int x = 0;
        for (int a : coins) {
            if (a > x + 1) {
                break;
            }
            x += a;
        }
        return x + 1;
    }
}
