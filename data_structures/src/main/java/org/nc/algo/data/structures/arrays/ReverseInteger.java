package org.nc.algo.data.structures.arrays;

public class ReverseInteger {

    public int reverse(int input) {
        int finalNumber = input % 10;
        int remainder = input / 10;

        while (remainder > 0) {
            finalNumber = finalNumber * 10 + (remainder % 10);
            remainder = remainder / 10;
        }
        return finalNumber;
    }
}
