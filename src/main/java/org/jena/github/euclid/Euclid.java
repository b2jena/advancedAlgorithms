package org.jena.github.euclid;

public class Euclid {
    /**
     * implementation with recursion<BR>
     * 22/6 - 3 REST OF 4
     * 6/4 - 1 REST OF 2
     * 4/2 - 2 REST OF 0
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcd(int number, int divisor) {
        int remaining = number % divisor;
        if (remaining != 0) {
            gcd(remaining, remaining);
        }
        return divisor;
    }

    /**
     * implementation with recursion<BR>
     * 22/6 - 3 REST OF 4
     * 6/4 - 1 REST OF 2
     * 4/2 - 2 REST OF 0
     * <p>
     * number/temp = result rest of the divisor
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcd2(int number, int divisor) {
        while (divisor != 0) {
            int temp = number % divisor;
            divisor = number % divisor;
            number = temp;
        }
        return number;
    }
}
