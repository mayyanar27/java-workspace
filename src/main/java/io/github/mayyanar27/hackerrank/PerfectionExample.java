package io.github.mayyanar27.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 05-07-2021
 * Time: 12:18
 */
public class PerfectionExample {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter wr = new PrintWriter(System.out);
        //int T = Integer.parseInt(br.readLine().trim());
        int T = 1;
        for (int t_i = 0; t_i < T; t_i++) {
            //int N = Integer.parseInt(br.readLine().trim());
            int N = 28;

            String out_ = Solve(N);
            System.out.println(out_);
        }

        // wr.close();
        //br.close();
    }

    static String Solve(int N) {
        // Write your code here
        int wholeNum = 1;
        for (int i = 2; i < N; i++) {
            if (wholeNum <= N) {
                if (N % i == 0) {
                    wholeNum = wholeNum + i;
                }
            } else {
                break;
            }
        }
        System.out.println(wholeNum);
        if (N == wholeNum) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
