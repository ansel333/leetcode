package org.ansel.war;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class Arraydiff {
    public static int[] arrayDiff1(int[] a, int[] b) {
        // Your code here
        List<Integer> indexList = new ArrayList<>();
        int index=0;
        for(int i=0; i<a.length; i++) {
            boolean o = false;
            for (int k : b) {
                if (a[i] == k) {
                    o = true;
                    break;
                }
            }
            if (o) indexList.add(i);
        }
        int[] c = new int[a.length - indexList.size()];
        int cIndex=0;
        for(int i=0; i<a.length; i++) {
            if (!indexList.contains(i)) {
                c[cIndex] = a[i];
                cIndex++;
            }
        }
        return c;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void randomTests() {
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            int[] arr1 = IntStream.range(0, rnd.nextInt(100)).map(x -> rnd.nextInt(25)).toArray();
            int[] arr2 = IntStream.range(0, rnd.nextInt(100)).map(x -> rnd.nextInt(25)).toArray();

            int[] expected = arrayDiff(arr1, arr2);
            int[] actual = arrayDiff(arr1, arr2);

            assertArrayEquals(expected, actual);
        }
    }
}
