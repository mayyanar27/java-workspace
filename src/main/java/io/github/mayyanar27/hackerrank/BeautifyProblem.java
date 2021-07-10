package io.github.mayyanar27.hackerrank;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 05-07-2021
 * Time: 14:19
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class BeautifyProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static long solve(int l, int r) {
        // Your code goes here
        double v = getvalues(l);
        double v2 = getvalues(r);
     /*   if (l == r) {
            return l;
        }*/
        if (v == 1 && v2 == 1) {
            return l + r;
        } else {
            return 0;
        }
    }

    /*private static long sumOfSquares(long l) {
        char[] chars = String.valueOf(l).toCharArray();
        double pow = 0;
        for (int i = 0; i < chars.length; i++) {
            Integer integer = Integer.valueOf(chars[i] - 48);
            pow = pow + Math.pow(integer, 2);
        }
        if (pow > 9) {
            return sumOfSquares(((long) pow));
        } else {
            return ((long) pow);
        }
        //return ((long) pow);
    }*/

    public static int getvalues(int n) {
        int a = n;
        int rem = 0;
        int sum = 0;
        while (a != 0) {
            rem = a % 10;
            sum = sum + (rem * rem);
            a = a / 10;
        }
        while (sum > 0) {
            return getvalues(sum);
        } /*else {
            return  sum;
        }*/
        return sum;
    }
}
