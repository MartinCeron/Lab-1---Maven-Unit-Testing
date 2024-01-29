package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {
    // Existing test functions for the constructor and add function

    /**
     * Test The OR function with two binary numbers of the same length
     */
    @Test
    public void or() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.or(binary1, binary2);
        assertEquals(binary3.getValue(), "1111");
    }

    /**
     * Test The OR function with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void or2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.or(binary1, binary2);
        assertEquals(binary3.getValue(), "1111");
    }

    /**
     * Test The OR function with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void or3() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.or(binary1, binary2);
        assertEquals(binary3.getValue(), "1111");
    }

    /**
     * Test The AND function with two binary numbers of the same length
     */
    @Test
    public void and() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.and(binary1, binary2);
        assertEquals(binary3.getValue(), "1000");
    }

    /**
     * Test The AND function with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void and2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.and(binary1, binary2);
        assertEquals(binary3.getValue(), "10");
    }

    /**
     * Test The AND function with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void and3() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.and(binary1, binary2);
        assertEquals(binary3.getValue(), "10");
    }

    /**
     * Test The multiply function with two binary numbers of the same length
     */
    @Test
    public void multiply() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.multiply(binary1, binary2);
        assertEquals(binary3.getValue(), "11110000");
    }

    /**
     * Test The multiply function with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void multiply2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.multiply(binary1, binary2);
        assertEquals(binary3.getValue(), "11110");
    }
}