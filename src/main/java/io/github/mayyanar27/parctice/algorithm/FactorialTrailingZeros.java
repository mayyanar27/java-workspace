package io.github.mayyanar27.parctice.algorithm;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 22-06-2021
 * Time: 18:13
 */
public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int i = 5;
        factorialTrainingZeros(i);
    }

    private static void factorialTrainingZeros(int i) {
        int count = 0;
        while (i > 0) {
            i = i / 5;
            System.out.println(i);
            count = count + i;
        }
        System.out.println(count);
    }
}
