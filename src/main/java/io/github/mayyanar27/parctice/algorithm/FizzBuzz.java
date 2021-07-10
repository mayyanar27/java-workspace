package io.github.mayyanar27.parctice.algorithm;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 22-06-2021
 * Time: 17:41
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 100; j++) {
            String x = fizzBuzzExecutor(j);
            if (x != null) {
                System.out.println(x);

            }

        }
    }

    private static String fizzBuzzExecutor(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(i);
    }
}
