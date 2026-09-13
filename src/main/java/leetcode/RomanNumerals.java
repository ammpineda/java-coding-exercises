package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LEET CODE PROBLEM 13 - Roman to Integer
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Constraints:
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanNumerals {

    private final static Map<Character, Integer> valueMapping = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    ));

    public int romanToInt(String s) {
        int sum = 0, previous = 0;

//        for(int i = s.length() -1; i >= 0; i--){
//            char c = s.toUpperCase().charAt(i);
//            int value = valueMapping.get(c);
//
//            if(value < previous){
//                sum = sum - value;
//            }else{
//                sum = sum + value;
//            }
//
//            previous = value;
//        }

        for(int i = 0; i <= s.length() -1; i++){
            char c = s.toUpperCase().charAt(i);
            int value = valueMapping.get(c);

            if(previous < value){
                sum -= previous;
                sum += (value - previous);
            } else {
                sum += value;
            }

            previous = value;
        }

        return sum;
    }

    public static void main (String[] args){
        System.out.println(new RomanNumerals().romanToInt("MMMCMXLVII"));
    }

}

