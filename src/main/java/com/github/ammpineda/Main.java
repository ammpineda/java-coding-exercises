package com.github.ammpineda;

import com.github.ammpineda.codility.PermMissingElem;
import com.github.ammpineda.codility.Riddle;

public class Main {
    public static void main(String[] args) {

        PermMissingElem e1 = new PermMissingElem();
        System.out.println(e1.solution(new int[]{}));

        Riddle e2 = new Riddle();
        System.out.println(e2.solution("a?b?"));

    }
}
