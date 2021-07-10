package io.github.mayyanar27.fun;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 28-06-2021
 * Time: 11:42
 */
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rowCount = scanner.nextInt();
        if (rowCount < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        System.out.println("Enter the number of seats in each row:");
        int seatPerRow = scanner.nextInt();

        if (seatPerRow < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        calculatePrice(rowCount, seatPerRow);

    }

    private static void calculatePrice(int rowCount, int seatPerRow) {
        int i = rowCount * seatPerRow;
        if (i < 60) {
            System.out.println("Total Prices : " + i * 10);
        } else {
            if (rowCount % 2 == 0) {
                int i1 = rowCount / 2;
                int front = (i1 * seatPerRow) * 10;
                int back = (i1 * seatPerRow) * 8;
                System.out.println("Total Prices : " + (front + back));
            } else {
                int halfValue = rowCount / 2;
                int front = (halfValue * seatPerRow) * 10;
                int back = ((halfValue + 1) * seatPerRow) * 8;
                System.out.println("Total Prices : " + (front + back));
            }
        }
    }
}
