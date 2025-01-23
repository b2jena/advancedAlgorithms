package org.jena.github.euclid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EuclidTest {
    @Test
    void gcdTest() {
        Euclid e = new Euclid();
        Assertions.assertEquals(2, e.gcd(10, 2));
        Assertions.assertEquals(2, e.gcd(22, 6));
    }
}
