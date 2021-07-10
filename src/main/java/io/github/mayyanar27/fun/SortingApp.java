package io.github.mayyanar27.fun;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 22-06-2021
 * Time: 10:18
 */
public class SortingApp {
    private static int[] a = {1, 4, 5, 6, 7, 8, 0, 1};

    public static void main(String[] args) {
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i] + "->" + a[i - 1]);
            if (a[i] > a[i - 1]) {
                a[i - 1] = a[i];
                System.out.println("updated value " + a[i-1]);
            } else {
                System.out.println("Skipping of " + i );
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
