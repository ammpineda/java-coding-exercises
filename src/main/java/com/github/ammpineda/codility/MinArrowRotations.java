package com.github.ammpineda.codility;

public class MinArrowRotations {

    public int solution(String S){

        char[] arrows = S.toCharArray();

        int countUp = 0;
        int countDown = 0;
        int countLeft = 0;
        int countRight = 0;

        for (char arrow : arrows){
            if('^' == arrow){
                countUp ++;
            } else if ('v' == arrow) {
                countDown ++;
            } else if ('<' == arrow) {
                countLeft ++;
            } else countRight ++;
        }

        // total amount of arrows - arrows that dont need to be rotated
        return arrows.length - Math.max(Math.max(countUp, countDown), Math.max(countLeft, countRight));
    }

    public static void main(String[] args) {
        System.out.println(new MinArrowRotations().solution("^^^>><<v")); // Result should be 5.
    }

}
