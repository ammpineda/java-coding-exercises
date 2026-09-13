package com.github.ammpineda.codility;

/**
 * A string S denotes the directions of N arrows, where each character is one of <, >, v, or ^ (left, right, down, up).
 *
 * In one move, you can rotate a single arrow to point in any of the four directions.
 * Your goal is to find the minimum number of arrows that must be rotated so that all arrows point in the same direction.
 *
 * Example: Given S = "^vv<v", the function should return 2, since rotating the ^ and < to v makes all 5 arrows point down, and no fewer rotations are possible.
 *
 */
public class MinArrowRotations {

    public int solution(String S){
        int countUp = 0;
        int countDown = 0;
        int countLeft = 0;
        int countRight = 0;

        for (char arrow : S.toCharArray()) {
            switch (arrow) {
                case '^' -> countUp++;
                case 'v' -> countDown++;
                case '<' -> countLeft++;
                case '>' -> countRight++;
            }
        }

        // total amount of arrows - arrows that dont need to be rotated
        return S.length() - Math.max(Math.max(countUp, countDown), Math.max(countLeft, countRight));
    }

    public static void main(String[] args) {
        System.out.println(new MinArrowRotations().solution("^^^>><<v")); // Result should be 5.
        System.out.println(new MinArrowRotations().solution(">><<^^vvv")); // Result should be 6

    }

}
