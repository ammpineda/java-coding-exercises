package leetcode;

public class Palindrome {

    public boolean isPalindrome(int x){
        String strX = String.valueOf(x);
        int rightIndex = strX.length() - 1;
        char[] charX = strX.toCharArray();
        for(int i = 0; i < strX.length(); i++){
            if(i == rightIndex)
                return true;

            if(!(charX[i] == charX[rightIndex]))
                return false;

            rightIndex--;
        }
        return true;
    }


    public static void main (String[]args){
        System.out.println(new Palindrome().isPalindrome(121)); // IS PALINDROME - TRUE
    }

}


