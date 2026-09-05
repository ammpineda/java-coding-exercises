package com.github.ammpineda.codility;

import java.util.Random;

/**
 * Write a function that , given a string riddle,
 * returns a copy of the string with all of the question
 * marks replaced by lowercase letters (a-z) in such a way
 * that the same letters do not occur next to each other.
 */
public class Riddle {

    final Random r = new Random();
    final String charSequence = "abc";

    public String solution(String input) {
        char[] word = input.toLowerCase().toCharArray();
        char[] letters = charSequence.toCharArray();
        int ri = 0;

        for(int i = 0; i < word.length; i++){
            if('?' == word[i]){
                // 1. Replace question mark right away.
                ri = r.nextInt(Math.max(0, letters.length));
                word[i] = letters[ri];

                // 2. Check if it's the first index, then checks the right adjacent only.
                if(i == 0){
                    while(word[i] == word[i+1]){
                        ri = r.nextInt(Math.max(0, letters.length));
                        word[i] = letters[ri];
                    }
                    continue;
                }

                // 3. Check if it's in the last index, then checks the left adjacent only.
                if(i == (word.length - 1)){
                    while(word[i] == word[i-1]){
                        ri = r.nextInt(Math.max(0, letters.length));
                        word[i] = letters[ri];
                    }
                    continue;
                }

                // 4. Checks if adjacent characters are the same as [i] character
                while((word[i] == word[i-1]) || (word[i] == word[i+1])){
                    ri = r.nextInt(Math.max(0, letters.length));
                    word[i] = letters[ri];
                }
            }
        }
        return String.valueOf(word);

    }

}
