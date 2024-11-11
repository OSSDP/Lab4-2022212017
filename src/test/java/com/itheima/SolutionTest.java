package com.itheima;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SolutionTest extends TestCase {
    @Test
    public void testLargestNumber() {
        Solution solution = new Solution();
        int[] nums1 = {10, 2};
        assertEquals("210", solution.largestNumber(nums1));

        int[] nums2 = {3, 30, 34, 5, 9};
        assertEquals("9534330", solution.largestNumber(nums2));

        int[] nums3 = {0, 0};
        assertEquals("0", solution.largestNumber(nums3));
    }
}