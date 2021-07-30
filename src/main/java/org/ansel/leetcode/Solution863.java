package org.ansel.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution863 {

    public static void main(String[] args) {
        Integer[] tree = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = new TreeNode(3);
        for (int i = 1; i < tree.length; i++) {
            root.add(root, tree[i]);
        }
    }

    private static TreeNode initTreeFromList(List<Integer> tree) {
        if (tree.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(tree.get(0));
        for (int i = 0; i < tree.size(); i++) {

        }

        return null;
    }

    // TODO: finish the solution
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();

        return result;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }

    public void add(TreeNode root, Integer integer) {
    }
}
