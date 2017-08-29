package ch05.sec01;

import java.util.Random;

public class ThrowingExceptions {

    private static Random generator = new Random();

    public static void main(String[] args) {

        System.out.println(randInt(10, 5));
    }

    public static int randInt(int low, int high) {

        if (low > high) {

            throw new IllegalArgumentException(
                    String.format(
                            "low should be <= high but low is %d and high is %d",
                            low, high)
            );
        }

        return low + (int) (generator.nextDouble() * (high - low + 1));
    }
}
