package com.bdg.algorithms;

import java.util.Random;

public class AlgorithmHomework {
    /**
     * you have a given number of small rice bags (1 kilo each)
     * and big rice bags (5 kilos each), this is a method that returns true if it is
     * possible to make a package with goal kilos of rice.
     *
     * @param smallBags  int
     * @param bigBags    int
     * @param goalWeight int
     * @return boolean
     */
    public boolean canMakePackage(int smallBags, int bigBags, int goalWeight) {

        if (goalWeight < 1 || goalWeight > smallBags + bigBags * 5) {
            return false;
        }

        int bigPackageNeeded = goalWeight / 5;

        if (bigPackageNeeded > bigBags) {
            bigPackageNeeded = bigBags;
            int smallPackageNeeded = goalWeight - bigPackageNeeded * 5;
            return smallBags >= smallPackageNeeded;
        } else {
            int smallPackageNeeded = goalWeight % 5;
            return smallBags >= smallPackageNeeded;
        }
    }

    /**
     * This is a method that calculates the largest prime factor of a given
     * number.
     * For example the prime factors of 455 are 5, 7 and 13.
     *
     * @param inputNumber int
     * @return int
     */
    public int largestPrimeFact(int inputNumber) {
        int largestPrimeFactor = 1;

        for (int factor = 2; factor <= inputNumber / factor; factor++) {
            while (inputNumber % factor == 0) {
                largestPrimeFactor = factor;
                inputNumber /= factor;
            }
        }

        if (inputNumber > 1) {
            largestPrimeFactor = inputNumber;
        }

        return largestPrimeFactor;
    }

    /**
     * This program generates a random number between 1 and 100
     * use the Random() method from the Math class.
     * The next step check whether it is an even or an odd number. Each of
     * the above actions is written to the console.
     */
    public void evenOrOdd() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Generated number: " + number);
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    /**
     * This program will use the while loop to find the largest and
     * smallest number from the set of 10 randomly drawn integers from 1 to
     * 100. This program written without arrays or other collections.
     */
    public void FindMinMax() {
        int min = 100;
        int max = 1;

        Random random = new Random();
        int i = 0;
        while (i < 10) {
            int number = random.nextInt(100) + 1;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            i++;
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
