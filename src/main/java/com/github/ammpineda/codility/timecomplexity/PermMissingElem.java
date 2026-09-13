package com.github.ammpineda.codility.timecomplexity;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity Problem - Perm Missing Element
 * An array A consisting of N different integers is given.
 * The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Assumptions:
 * - N is an integer within the range [0..100,000]
 * - the elements of A are all distinct
 * - each element of array A is an integer within the range [1..(N + 1)]
 *
 * Test cases:
 * - Missing element is at the start of the range: A = [2, 3, 4] → missing 1
 * - Missing element is at the end of the range: A = [1, 2, 3] → missing 4
 * - Missing element is in the middle: A = [1, 2, 4, 5] → missing 3
 */
public class PermMissingElem {

    public int solution(int[] input) {
        if(input.length == 0) return 1;

        List<Integer> series = new ArrayList<>();
        for(int n : input) series.add(n);

        series = series.stream().sorted().toList();

        for(int i = 1; i <= series.size(); i++){
            if(i != series.get(i - 1)){
                return i;
            }
        }

        return series.size() + 1; // default
    }

    public static void main(String[] args) {

        System.out.println(new PermMissingElem().solution(new int[]{1, 2, 3}));

        /**
         * Developer Hindsights:
         *
         * Use the mathematical formula for series of integers to solve this.
         */

    }
}
