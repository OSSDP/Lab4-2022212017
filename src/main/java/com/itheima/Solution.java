package com.itheima;
import java.util.Arrays;
public class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        Arrays.sort(numsArr, (x, y) -> {
            String xy = x + "" + y;
            String yx = y + "" + x;
            return yx.compareTo(xy);
        });

        if (numsArr[0] == 0) {
            return "0";
        }

        StringBuilder ret = new StringBuilder();
        for (Integer num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }
}
