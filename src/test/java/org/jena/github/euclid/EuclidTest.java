package org.jena.github.euclid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EuclidTest {
    Euclid e = null;

    @BeforeEach
    void init() {
        e = new Euclid();
    }

    @Test
    void gcdTest() {
        Assertions.assertEquals(2, e.gcd(10, 2));
        Assertions.assertEquals(2, e.gcd(22, 6));
    }

    @Test
    void gcd2Test() {
        Assertions.assertEquals(2, e.gcd2(10, 2));
        Assertions.assertEquals(2, e.gcd2(22, 6));
    }
}
