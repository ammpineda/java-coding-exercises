package com.github.ammpineda.codility;

import java.util.Random;

/**
 * Write a function that , given a string riddle,
 * returns a copy of the string with all of the question
 * marks replaced by lowercase letters (a-z) in such a way
 * that the same letters do not occur next to each other.
 */
public class FillMissingLetters {

    final String charSequence = "abc";

    public String solution(String input) {
        char[] word = input.toLowerCase().toCharArray();
        char[] letters = charSequence.toCharArray();

        for(int i = 0; i < word.length; i++){
            if('?' == word[i]){
                for(char letter : letters){
                    boolean isSameAsRight =
                            i < word.length - 1 && // ensures that it is not the last index
                                    word[i] == word[i+1]; // same as the right adjacent -->


                    boolean isSameAsLeft =
                            i > 0 && // ensures that its not the first index
                                    word[i] == word[i-1]; // same as the left adjacent <--

                    // Checks if both flags are unfulfilled
                    if(!isSameAsRight && !isSameAsLeft){
                        word[i] = letter;
                        break;
                    }
                }
            }
        }
        return String.valueOf(word);

    }

    public static void main(String[] args) {

        System.out.println(new FillMissingLetters().solution("?dl".toLowerCase()));;
        System.out.println(new FillMissingLetters().solution("asda?".toLowerCase()));
        System.out.println(new FillMissingLetters().solution("jkhasd?askjmnd".toLowerCase()));


        /**
         * Developer Hindsights:
         * After reviewing my original solution,I realized there's a more efficient way to solve this problem.
         * My solution "works and finishes eventually,"
         * But depending on randomness to generate a letter that will fit to replace the '?' character
         * can lead to longer runtime behavior as it could retry for an unpredictable n amount of times
         * before it finds the fit letter.
         *
         * In my updated solution, I limited the number of letter candidates to 3 distinct letters only,
         * considering that I have to deal with 2 adjacent letters only,
         * And I looped through those 3 letter candidates so that retries would only reach up to 3 times.
         *
         * I created flags where one checks if current index is same as the left adjacent
         * and one that checks if current index is same as the right adjacent.
         * Each flag already considers the first and last index cases.
         * Then finally ensures if both flags were not met, before replacing the current index.
         *
         */
    }

}
