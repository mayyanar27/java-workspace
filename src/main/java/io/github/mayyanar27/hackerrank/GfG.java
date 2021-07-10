package io.github.mayyanar27.hackerrank;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 05-07-2021
 * Time: 16:26
 */
import java.util.*;

public class GfG {

    static int digSum(int n)
    {
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Driver code
    public static void main(String argc[])
    {
        int n = 7;
        System.out.println(digSum(n));
    }
}
