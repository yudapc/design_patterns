package learning.maximum_consecutive;

import java.util.ArrayList;

/*
Maximum consecutive one’s (or zeros) in a binary array
Given binary array, find count of maximum number of consecutive 1’s present in the array.

A simple solution is consider every subarray and count 1’s in every subarray. Finally return return size of largest subarray with all 1’s.

An efficient solution is traverse array from left to right. If we see a 1, we increment count and compare it with maximum so far. If we see a 0, we reset count as 0.
*/

public class MaximumConsecutive {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,1,0,1,1,0,0,0};
        int count = 0;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }
        System.out.println(result);
    }
}
