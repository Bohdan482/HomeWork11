package org.example.NumberSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberSorter {
    public static void main(String[] args) {
        String[] lines = new String[2];
        lines[0] = "1, 2, 0";
        lines[1] = "4, 5";

        List<String> sorted =
                Arrays.stream((lines[0] + ", " + lines[1]).split(", "))
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println("sorted = " + sorted);
    }
}
