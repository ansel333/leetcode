package org.ansel.war;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Write a function that takes an integer as input, and returns the number of bits that are equal to
 * one in the binary representation of that number. You can guarantee that input is non-negative.
 */
@Slf4j
public class BitCounting {

    private final static Logger logger = LoggerFactory.getLogger(BitCounting.class);

    public static int countBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        logger.info("The binary string of {} is: {}", n, binaryString);
//        int result = 0;
//        for (char ch : binaryString.toCharArray()) {
//            result += (ch == '1') ? 1 : 0;
//        }
//        return result;
        return Integer.bitCount(n);
    }
}
