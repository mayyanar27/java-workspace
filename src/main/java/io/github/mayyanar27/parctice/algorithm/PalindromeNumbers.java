package io.github.mayyanar27.parctice.algorithm;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 22-06-2021
 * Time: 17:48
 */
public class PalindromeNumbers {
    public static void main(String[] args) {
        int i = 121;
        //palindromeNumbers(i);
        System.out.println(reverseNum(i)); // Best Way
    }

    private static boolean reverseNum(int i) {
        int reverserNum = 0;
        while (i > reverserNum) {
            int mod = i % 10;
            reverserNum = reverserNum * 10 + mod;
            System.out.println(reverserNum);
            i = i / 10;
            System.out.println( "Latest I " + i);
        }
        return (i == reverserNum) || ( i == reverserNum/10);

       // return false;
    }

    private static void palindromeNumbers(int i) {
        String s = Integer.toString(i);
        String reverse = reverseStr(s);
        System.out.println(reverse);
        if (i == Integer.parseInt(reverse))
            System.out.println("Number " + i + " is palindrome");
        else
            System.out.println("Number " + i + " is not a palindrome");
    }

    private static String reverseStr(String s) {
        char[] chars = s.toCharArray();
        char reverChar[] = new char[chars.length];
        int lengh = 0;
        for (int i = chars.length - 1; i == chars.length; i--) {
            reverChar[lengh++] = chars[i];
        }

        return new String(chars);
    }
}
