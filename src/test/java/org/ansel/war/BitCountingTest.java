package org.ansel.war;

import org.junit.Assert;
import org.junit.Test;

public class BitCountingTest {
    @Test
    public void testCountBits() {
        Assert.assertEquals(5, BitCounting.countBits(1234));
        Assert.assertEquals(1, BitCounting.countBits(4));
        Assert.assertEquals(3, BitCounting.countBits(7));
        Assert.assertEquals(2, BitCounting.countBits(9));
        Assert.assertEquals(2, BitCounting.countBits(10));
    }
}