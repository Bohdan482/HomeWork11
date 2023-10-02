package org.example.Randomizer;

import java.util.stream.Stream;

public class Randomizer {
    public Stream<Long> randome(long a, long c, long m) {
            return Stream.iterate(1L, n -> (a * n + c) % m);
    }
}
